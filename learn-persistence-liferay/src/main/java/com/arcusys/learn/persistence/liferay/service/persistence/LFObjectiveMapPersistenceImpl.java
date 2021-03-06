package com.arcusys.learn.persistence.liferay.service.persistence;

import com.arcusys.learn.persistence.liferay.NoSuchLFObjectiveMapException;
import com.arcusys.learn.persistence.liferay.model.LFObjectiveMap;
import com.arcusys.learn.persistence.liferay.model.impl.LFObjectiveMapImpl;
import com.arcusys.learn.persistence.liferay.model.impl.LFObjectiveMapModelImpl;
import com.arcusys.learn.persistence.liferay.service.persistence.LFActivityDataMapPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFActivityPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFActivityStateNodePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFActivityStatePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFActivityStateTreePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFAnswerPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFAttemptDataPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFAttemptPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFBigDecimalPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFChildrenSelectionPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFConditionRulePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFCoursePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFFileStoragePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFGlobalObjectiveStatePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFObjectiveMapPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFObjectivePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFObjectiveStatePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFPackagePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFPackageScopeRulePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFPlayerScopeRulePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFQuestionCategoryPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFQuestionPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFQuizPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFQuizQuestionCategoryPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFQuizQuestionPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFResourcePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFRollupContributionPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFRollupRulePersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFRuleConditionPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFSequencingPermissionsPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFSequencingPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFSequencingTrackingPersistence;
import com.arcusys.learn.persistence.liferay.service.persistence.LFUserPersistence;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the l f objective map service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFObjectiveMapPersistence
 * @see LFObjectiveMapUtil
 * @generated
 */
public class LFObjectiveMapPersistenceImpl extends BasePersistenceImpl<LFObjectiveMap>
    implements LFObjectiveMapPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link LFObjectiveMapUtil} to access the l f objective map persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = LFObjectiveMapImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_OBJECTIVEID =
        new FinderPath(LFObjectiveMapModelImpl.ENTITY_CACHE_ENABLED,
            LFObjectiveMapModelImpl.FINDER_CACHE_ENABLED,
            LFObjectiveMapImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByObjectiveID",
            new String[] {
                Integer.class.getName(),
                
            "java.lang.Integer", "java.lang.Integer",
                "com.liferay.portal.kernel.util.OrderByComparator"
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OBJECTIVEID =
        new FinderPath(LFObjectiveMapModelImpl.ENTITY_CACHE_ENABLED,
            LFObjectiveMapModelImpl.FINDER_CACHE_ENABLED,
            LFObjectiveMapImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByObjectiveID",
            new String[] { Integer.class.getName() },
            LFObjectiveMapModelImpl.OBJECTIVEID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_OBJECTIVEID = new FinderPath(LFObjectiveMapModelImpl.ENTITY_CACHE_ENABLED,
            LFObjectiveMapModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByObjectiveID",
            new String[] { Integer.class.getName() });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LFObjectiveMapModelImpl.ENTITY_CACHE_ENABLED,
            LFObjectiveMapModelImpl.FINDER_CACHE_ENABLED,
            LFObjectiveMapImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LFObjectiveMapModelImpl.ENTITY_CACHE_ENABLED,
            LFObjectiveMapModelImpl.FINDER_CACHE_ENABLED,
            LFObjectiveMapImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LFObjectiveMapModelImpl.ENTITY_CACHE_ENABLED,
            LFObjectiveMapModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_LFOBJECTIVEMAP = "SELECT lfObjectiveMap FROM LFObjectiveMap lfObjectiveMap";
    private static final String _SQL_SELECT_LFOBJECTIVEMAP_WHERE = "SELECT lfObjectiveMap FROM LFObjectiveMap lfObjectiveMap WHERE ";
    private static final String _SQL_COUNT_LFOBJECTIVEMAP = "SELECT COUNT(lfObjectiveMap) FROM LFObjectiveMap lfObjectiveMap";
    private static final String _SQL_COUNT_LFOBJECTIVEMAP_WHERE = "SELECT COUNT(lfObjectiveMap) FROM LFObjectiveMap lfObjectiveMap WHERE ";
    private static final String _FINDER_COLUMN_OBJECTIVEID_OBJECTIVEID_NULL = "lfObjectiveMap.objectiveID IS NULL";
    private static final String _FINDER_COLUMN_OBJECTIVEID_OBJECTIVEID_NULL_2 = "lfObjectiveMap.objectiveID IS NULL ";
    private static final String _FINDER_COLUMN_OBJECTIVEID_OBJECTIVEID_2 = "lfObjectiveMap.objectiveID = ?";
    private static final String _ORDER_BY_ENTITY_ALIAS = "lfObjectiveMap.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LFObjectiveMap exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No LFObjectiveMap exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(LFObjectiveMapPersistenceImpl.class);
    private static LFObjectiveMap _nullLFObjectiveMap = new LFObjectiveMapImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<LFObjectiveMap> toCacheModel() {
                return _nullLFObjectiveMapCacheModel;
            }
        };

    private static CacheModel<LFObjectiveMap> _nullLFObjectiveMapCacheModel = new CacheModel<LFObjectiveMap>() {
            public LFObjectiveMap toEntityModel() {
                return _nullLFObjectiveMap;
            }
        };

    @BeanReference(type = LFActivityPersistence.class)
    protected LFActivityPersistence lfActivityPersistence;
    @BeanReference(type = LFActivityDataMapPersistence.class)
    protected LFActivityDataMapPersistence lfActivityDataMapPersistence;
    @BeanReference(type = LFActivityStatePersistence.class)
    protected LFActivityStatePersistence lfActivityStatePersistence;
    @BeanReference(type = LFActivityStateNodePersistence.class)
    protected LFActivityStateNodePersistence lfActivityStateNodePersistence;
    @BeanReference(type = LFActivityStateTreePersistence.class)
    protected LFActivityStateTreePersistence lfActivityStateTreePersistence;
    @BeanReference(type = LFAnswerPersistence.class)
    protected LFAnswerPersistence lfAnswerPersistence;
    @BeanReference(type = LFAttemptPersistence.class)
    protected LFAttemptPersistence lfAttemptPersistence;
    @BeanReference(type = LFAttemptDataPersistence.class)
    protected LFAttemptDataPersistence lfAttemptDataPersistence;
    @BeanReference(type = LFBigDecimalPersistence.class)
    protected LFBigDecimalPersistence lfBigDecimalPersistence;
    @BeanReference(type = LFChildrenSelectionPersistence.class)
    protected LFChildrenSelectionPersistence lfChildrenSelectionPersistence;
    @BeanReference(type = LFConditionRulePersistence.class)
    protected LFConditionRulePersistence lfConditionRulePersistence;
    @BeanReference(type = LFCoursePersistence.class)
    protected LFCoursePersistence lfCoursePersistence;
    @BeanReference(type = LFFileStoragePersistence.class)
    protected LFFileStoragePersistence lfFileStoragePersistence;
    @BeanReference(type = LFGlobalObjectiveStatePersistence.class)
    protected LFGlobalObjectiveStatePersistence lfGlobalObjectiveStatePersistence;
    @BeanReference(type = LFObjectivePersistence.class)
    protected LFObjectivePersistence lfObjectivePersistence;
    @BeanReference(type = LFObjectiveMapPersistence.class)
    protected LFObjectiveMapPersistence lfObjectiveMapPersistence;
    @BeanReference(type = LFObjectiveStatePersistence.class)
    protected LFObjectiveStatePersistence lfObjectiveStatePersistence;
    @BeanReference(type = LFPackagePersistence.class)
    protected LFPackagePersistence lfPackagePersistence;
    @BeanReference(type = LFPackageScopeRulePersistence.class)
    protected LFPackageScopeRulePersistence lfPackageScopeRulePersistence;
    @BeanReference(type = LFPlayerScopeRulePersistence.class)
    protected LFPlayerScopeRulePersistence lfPlayerScopeRulePersistence;
    @BeanReference(type = LFQuestionPersistence.class)
    protected LFQuestionPersistence lfQuestionPersistence;
    @BeanReference(type = LFQuestionCategoryPersistence.class)
    protected LFQuestionCategoryPersistence lfQuestionCategoryPersistence;
    @BeanReference(type = LFQuizPersistence.class)
    protected LFQuizPersistence lfQuizPersistence;
    @BeanReference(type = LFQuizQuestionPersistence.class)
    protected LFQuizQuestionPersistence lfQuizQuestionPersistence;
    @BeanReference(type = LFQuizQuestionCategoryPersistence.class)
    protected LFQuizQuestionCategoryPersistence lfQuizQuestionCategoryPersistence;
    @BeanReference(type = LFResourcePersistence.class)
    protected LFResourcePersistence lfResourcePersistence;
    @BeanReference(type = LFRollupContributionPersistence.class)
    protected LFRollupContributionPersistence lfRollupContributionPersistence;
    @BeanReference(type = LFRollupRulePersistence.class)
    protected LFRollupRulePersistence lfRollupRulePersistence;
    @BeanReference(type = LFRuleConditionPersistence.class)
    protected LFRuleConditionPersistence lfRuleConditionPersistence;
    @BeanReference(type = LFSequencingPersistence.class)
    protected LFSequencingPersistence lfSequencingPersistence;
    @BeanReference(type = LFSequencingPermissionsPersistence.class)
    protected LFSequencingPermissionsPersistence lfSequencingPermissionsPersistence;
    @BeanReference(type = LFSequencingTrackingPersistence.class)
    protected LFSequencingTrackingPersistence lfSequencingTrackingPersistence;
    @BeanReference(type = LFUserPersistence.class)
    protected LFUserPersistence lfUserPersistence;
    @BeanReference(type = ResourcePersistence.class)
    protected ResourcePersistence resourcePersistence;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;

    /**
     * Caches the l f objective map in the entity cache if it is enabled.
     *
     * @param lfObjectiveMap the l f objective map
     */
    public void cacheResult(LFObjectiveMap lfObjectiveMap) {
        EntityCacheUtil.putResult(LFObjectiveMapModelImpl.ENTITY_CACHE_ENABLED,
            LFObjectiveMapImpl.class, lfObjectiveMap.getPrimaryKey(),
            lfObjectiveMap);

        lfObjectiveMap.resetOriginalValues();
    }

    /**
     * Caches the l f objective maps in the entity cache if it is enabled.
     *
     * @param lfObjectiveMaps the l f objective maps
     */
    public void cacheResult(List<LFObjectiveMap> lfObjectiveMaps) {
        for (LFObjectiveMap lfObjectiveMap : lfObjectiveMaps) {
            if (EntityCacheUtil.getResult(
                        LFObjectiveMapModelImpl.ENTITY_CACHE_ENABLED,
                        LFObjectiveMapImpl.class, lfObjectiveMap.getPrimaryKey()) == null) {
                cacheResult(lfObjectiveMap);
            } else {
                lfObjectiveMap.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all l f objective maps.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(LFObjectiveMapImpl.class.getName());
        }

        EntityCacheUtil.clearCache(LFObjectiveMapImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the l f objective map.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(LFObjectiveMap lfObjectiveMap) {
        EntityCacheUtil.removeResult(LFObjectiveMapModelImpl.ENTITY_CACHE_ENABLED,
            LFObjectiveMapImpl.class, lfObjectiveMap.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<LFObjectiveMap> lfObjectiveMaps) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (LFObjectiveMap lfObjectiveMap : lfObjectiveMaps) {
            EntityCacheUtil.removeResult(LFObjectiveMapModelImpl.ENTITY_CACHE_ENABLED,
                LFObjectiveMapImpl.class, lfObjectiveMap.getPrimaryKey());
        }
    }

    /**
     * Creates a new l f objective map with the primary key. Does not add the l f objective map to the database.
     *
     * @param id the primary key for the new l f objective map
     * @return the new l f objective map
     */
    public LFObjectiveMap create(long id) {
        LFObjectiveMap lfObjectiveMap = new LFObjectiveMapImpl();

        lfObjectiveMap.setNew(true);
        lfObjectiveMap.setPrimaryKey(id);

        return lfObjectiveMap;
    }

    /**
     * Removes the l f objective map with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the l f objective map
     * @return the l f objective map that was removed
     * @throws com.arcusys.learn.persistence.liferay.NoSuchLFObjectiveMapException if a l f objective map with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public LFObjectiveMap remove(long id)
        throws NoSuchLFObjectiveMapException, SystemException {
        return remove(Long.valueOf(id));
    }

    /**
     * Removes the l f objective map with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the l f objective map
     * @return the l f objective map that was removed
     * @throws com.arcusys.learn.persistence.liferay.NoSuchLFObjectiveMapException if a l f objective map with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LFObjectiveMap remove(Serializable primaryKey)
        throws NoSuchLFObjectiveMapException, SystemException {
        Session session = null;

        try {
            session = openSession();

            LFObjectiveMap lfObjectiveMap = (LFObjectiveMap) session.get(LFObjectiveMapImpl.class,
                    primaryKey);

            if (lfObjectiveMap == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchLFObjectiveMapException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(lfObjectiveMap);
        } catch (NoSuchLFObjectiveMapException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected LFObjectiveMap removeImpl(LFObjectiveMap lfObjectiveMap)
        throws SystemException {
        lfObjectiveMap = toUnwrappedModel(lfObjectiveMap);

        Session session = null;

        try {
            session = openSession();

            BatchSessionUtil.delete(session, lfObjectiveMap);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        clearCache(lfObjectiveMap);

        return lfObjectiveMap;
    }

    @Override
    public LFObjectiveMap updateImpl(
        com.arcusys.learn.persistence.liferay.model.LFObjectiveMap lfObjectiveMap,
        boolean merge) throws SystemException {
        lfObjectiveMap = toUnwrappedModel(lfObjectiveMap);

        boolean isNew = lfObjectiveMap.isNew();

        LFObjectiveMapModelImpl lfObjectiveMapModelImpl = (LFObjectiveMapModelImpl) lfObjectiveMap;

        Session session = null;

        try {
            session = openSession();

            BatchSessionUtil.update(session, lfObjectiveMap, merge);

            lfObjectiveMap.setNew(false);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !LFObjectiveMapModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((lfObjectiveMapModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OBJECTIVEID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        /* Integer.valueOf(   */
                        lfObjectiveMapModelImpl.getOriginalObjectiveID()
                    /* ) */
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_OBJECTIVEID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OBJECTIVEID,
                    args);

                args = new Object[] { /* Integer.valueOf( */
                        lfObjectiveMapModelImpl.getObjectiveID()/* ) */
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_OBJECTIVEID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OBJECTIVEID,
                    args);
            }
        }

        EntityCacheUtil.putResult(LFObjectiveMapModelImpl.ENTITY_CACHE_ENABLED,
            LFObjectiveMapImpl.class, lfObjectiveMap.getPrimaryKey(),
            lfObjectiveMap);

        return lfObjectiveMap;
    }

    protected LFObjectiveMap toUnwrappedModel(LFObjectiveMap lfObjectiveMap) {
        if (lfObjectiveMap instanceof LFObjectiveMapImpl) {
            return lfObjectiveMap;
        }

        LFObjectiveMapImpl lfObjectiveMapImpl = new LFObjectiveMapImpl();

        lfObjectiveMapImpl.setNew(lfObjectiveMap.isNew());
        lfObjectiveMapImpl.setPrimaryKey(lfObjectiveMap.getPrimaryKey());

        lfObjectiveMapImpl.setId(lfObjectiveMap.getId());
        lfObjectiveMapImpl.setObjectiveID(lfObjectiveMap.getObjectiveID());
        lfObjectiveMapImpl.setReadSatisfiedStatusFrom(lfObjectiveMap.getReadSatisfiedStatusFrom());
        lfObjectiveMapImpl.setReadNormalizedMeasureFrom(lfObjectiveMap.getReadNormalizedMeasureFrom());
        lfObjectiveMapImpl.setWriteSatisfiedStatusTo(lfObjectiveMap.getWriteSatisfiedStatusTo());
        lfObjectiveMapImpl.setWriteNormalizedMeasureTo(lfObjectiveMap.getWriteNormalizedMeasureTo());
        lfObjectiveMapImpl.setReadRawScoreFrom(lfObjectiveMap.getReadRawScoreFrom());
        lfObjectiveMapImpl.setReadMinScoreFrom(lfObjectiveMap.getReadMinScoreFrom());
        lfObjectiveMapImpl.setReadMaxScoreFrom(lfObjectiveMap.getReadMaxScoreFrom());
        lfObjectiveMapImpl.setReadCompletionStatusFrom(lfObjectiveMap.getReadCompletionStatusFrom());
        lfObjectiveMapImpl.setReadProgressMeasureFrom(lfObjectiveMap.getReadProgressMeasureFrom());
        lfObjectiveMapImpl.setWriteRawScoreTo(lfObjectiveMap.getWriteRawScoreTo());
        lfObjectiveMapImpl.setWriteMinScoreTo(lfObjectiveMap.getWriteMinScoreTo());
        lfObjectiveMapImpl.setWriteMaxScoreTo(lfObjectiveMap.getWriteMaxScoreTo());
        lfObjectiveMapImpl.setWriteCompletionStatusTo(lfObjectiveMap.getWriteCompletionStatusTo());
        lfObjectiveMapImpl.setWriteProgressMeasureTo(lfObjectiveMap.getWriteProgressMeasureTo());

        return lfObjectiveMapImpl;
    }

    /**
     * Returns the l f objective map with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the l f objective map
     * @return the l f objective map
     * @throws com.liferay.portal.NoSuchModelException if a l f objective map with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LFObjectiveMap findByPrimaryKey(Serializable primaryKey)
        throws NoSuchModelException, SystemException {
        return findByPrimaryKey(((Long) primaryKey).longValue());
    }

    /**
     * Returns the l f objective map with the primary key or throws a {@link com.arcusys.learn.persistence.liferay.NoSuchLFObjectiveMapException} if it could not be found.
     *
     * @param id the primary key of the l f objective map
     * @return the l f objective map
     * @throws com.arcusys.learn.persistence.liferay.NoSuchLFObjectiveMapException if a l f objective map with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public LFObjectiveMap findByPrimaryKey(long id)
        throws NoSuchLFObjectiveMapException, SystemException {
        LFObjectiveMap lfObjectiveMap = fetchByPrimaryKey(id);

        if (lfObjectiveMap == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
            }

            throw new NoSuchLFObjectiveMapException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                id);
        }

        return lfObjectiveMap;
    }

    /**
     * Returns the l f objective map with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the l f objective map
     * @return the l f objective map, or <code>null</code> if a l f objective map with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LFObjectiveMap fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        return fetchByPrimaryKey(((Long) primaryKey).longValue());
    }

    /**
     * Returns the l f objective map with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the l f objective map
     * @return the l f objective map, or <code>null</code> if a l f objective map with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public LFObjectiveMap fetchByPrimaryKey(long id) throws SystemException {
        LFObjectiveMap lfObjectiveMap = (LFObjectiveMap) EntityCacheUtil.getResult(LFObjectiveMapModelImpl.ENTITY_CACHE_ENABLED,
                LFObjectiveMapImpl.class, id);

        if (lfObjectiveMap == _nullLFObjectiveMap) {
            return null;
        }

        if (lfObjectiveMap == null) {
            Session session = null;

            boolean hasException = false;

            try {
                session = openSession();

                lfObjectiveMap = (LFObjectiveMap) session.get(LFObjectiveMapImpl.class,
                        Long.valueOf(id));
            } catch (Exception e) {
                hasException = true;

                throw processException(e);
            } finally {
                if (lfObjectiveMap != null) {
                    cacheResult(lfObjectiveMap);
                } else if (!hasException) {
                    EntityCacheUtil.putResult(LFObjectiveMapModelImpl.ENTITY_CACHE_ENABLED,
                        LFObjectiveMapImpl.class, id, _nullLFObjectiveMap);
                }

                closeSession(session);
            }
        }

        return lfObjectiveMap;
    }

    /**
     * Returns all the l f objective maps where objectiveID = &#63;.
     *
     * @param objectiveID the objective i d
     * @return the matching l f objective maps
     * @throws SystemException if a system exception occurred
     */
    public List<LFObjectiveMap> findByObjectiveID(Integer objectiveID)
        throws SystemException {
        return findByObjectiveID(objectiveID, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the l f objective maps where objectiveID = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param objectiveID the objective i d
     * @param start the lower bound of the range of l f objective maps
     * @param end the upper bound of the range of l f objective maps (not inclusive)
     * @return the range of matching l f objective maps
     * @throws SystemException if a system exception occurred
     */
    public List<LFObjectiveMap> findByObjectiveID(Integer objectiveID,
        int start, int end) throws SystemException {
        return findByObjectiveID(objectiveID, start, end, null);
    }

    /**
     * Returns an ordered range of all the l f objective maps where objectiveID = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param objectiveID the objective i d
     * @param start the lower bound of the range of l f objective maps
     * @param end the upper bound of the range of l f objective maps (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching l f objective maps
     * @throws SystemException if a system exception occurred
     */
    public List<LFObjectiveMap> findByObjectiveID(Integer objectiveID,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OBJECTIVEID;
            finderArgs = new Object[] { objectiveID };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_OBJECTIVEID;
            finderArgs = new Object[] { objectiveID, start, end, orderByComparator };
        }

        List<LFObjectiveMap> list = (List<LFObjectiveMap>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (LFObjectiveMap lfObjectiveMap : list) {
                if (!Validator.equals(objectiveID,
                            lfObjectiveMap.getObjectiveID())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(2);
            }

            query.append(_SQL_SELECT_LFOBJECTIVEMAP_WHERE);

            if (objectiveID == null) {
                query.append(_FINDER_COLUMN_OBJECTIVEID_OBJECTIVEID_NULL_2);
            } else {
                query.append(_FINDER_COLUMN_OBJECTIVEID_OBJECTIVEID_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (objectiveID != null) {
                    qPos.add(objectiveID.intValue());
                }

                list = (List<LFObjectiveMap>) QueryUtil.list(q, getDialect(),
                        start, end);
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (list == null) {
                    FinderCacheUtil.removeResult(finderPath, finderArgs);
                } else {
                    cacheResult(list);

                    FinderCacheUtil.putResult(finderPath, finderArgs, list);
                }

                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first l f objective map in the ordered set where objectiveID = &#63;.
     *
     * @param objectiveID the objective i d
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching l f objective map
     * @throws com.arcusys.learn.persistence.liferay.NoSuchLFObjectiveMapException if a matching l f objective map could not be found
     * @throws SystemException if a system exception occurred
     */
    public LFObjectiveMap findByObjectiveID_First(Integer objectiveID,
        OrderByComparator orderByComparator)
        throws NoSuchLFObjectiveMapException, SystemException {
        LFObjectiveMap lfObjectiveMap = fetchByObjectiveID_First(objectiveID,
                orderByComparator);

        if (lfObjectiveMap != null) {
            return lfObjectiveMap;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("objectiveID=");
        msg.append(objectiveID);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchLFObjectiveMapException(msg.toString());
    }

    /**
     * Returns the first l f objective map in the ordered set where objectiveID = &#63;.
     *
     * @param objectiveID the objective i d
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching l f objective map, or <code>null</code> if a matching l f objective map could not be found
     * @throws SystemException if a system exception occurred
     */
    public LFObjectiveMap fetchByObjectiveID_First(Integer objectiveID,
        OrderByComparator orderByComparator) throws SystemException {
        List<LFObjectiveMap> list = findByObjectiveID(objectiveID, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last l f objective map in the ordered set where objectiveID = &#63;.
     *
     * @param objectiveID the objective i d
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching l f objective map
     * @throws com.arcusys.learn.persistence.liferay.NoSuchLFObjectiveMapException if a matching l f objective map could not be found
     * @throws SystemException if a system exception occurred
     */
    public LFObjectiveMap findByObjectiveID_Last(Integer objectiveID,
        OrderByComparator orderByComparator)
        throws NoSuchLFObjectiveMapException, SystemException {
        LFObjectiveMap lfObjectiveMap = fetchByObjectiveID_Last(objectiveID,
                orderByComparator);

        if (lfObjectiveMap != null) {
            return lfObjectiveMap;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("objectiveID=");
        msg.append(objectiveID);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchLFObjectiveMapException(msg.toString());
    }

    /**
     * Returns the last l f objective map in the ordered set where objectiveID = &#63;.
     *
     * @param objectiveID the objective i d
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching l f objective map, or <code>null</code> if a matching l f objective map could not be found
     * @throws SystemException if a system exception occurred
     */
    public LFObjectiveMap fetchByObjectiveID_Last(Integer objectiveID,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByObjectiveID(objectiveID);

        List<LFObjectiveMap> list = findByObjectiveID(objectiveID, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the l f objective maps before and after the current l f objective map in the ordered set where objectiveID = &#63;.
     *
     * @param id the primary key of the current l f objective map
     * @param objectiveID the objective i d
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next l f objective map
     * @throws com.arcusys.learn.persistence.liferay.NoSuchLFObjectiveMapException if a l f objective map with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public LFObjectiveMap[] findByObjectiveID_PrevAndNext(long id,
        Integer objectiveID, OrderByComparator orderByComparator)
        throws NoSuchLFObjectiveMapException, SystemException {
        LFObjectiveMap lfObjectiveMap = findByPrimaryKey(id);

        Session session = null;

        try {
            session = openSession();

            LFObjectiveMap[] array = new LFObjectiveMapImpl[3];

            array[0] = getByObjectiveID_PrevAndNext(session, lfObjectiveMap,
                    objectiveID, orderByComparator, true);

            array[1] = lfObjectiveMap;

            array[2] = getByObjectiveID_PrevAndNext(session, lfObjectiveMap,
                    objectiveID, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected LFObjectiveMap getByObjectiveID_PrevAndNext(Session session,
        LFObjectiveMap lfObjectiveMap, Integer objectiveID,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_LFOBJECTIVEMAP_WHERE);

        if (objectiveID == null) {
            query.append(_FINDER_COLUMN_OBJECTIVEID_OBJECTIVEID_NULL_2);
        } else {
            query.append(_FINDER_COLUMN_OBJECTIVEID_OBJECTIVEID_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (objectiveID != null) {
            qPos.add(objectiveID.intValue());
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(lfObjectiveMap);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<LFObjectiveMap> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Returns all the l f objective maps.
     *
     * @return the l f objective maps
     * @throws SystemException if a system exception occurred
     */
    public List<LFObjectiveMap> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the l f objective maps.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param start the lower bound of the range of l f objective maps
     * @param end the upper bound of the range of l f objective maps (not inclusive)
     * @return the range of l f objective maps
     * @throws SystemException if a system exception occurred
     */
    public List<LFObjectiveMap> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the l f objective maps.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param start the lower bound of the range of l f objective maps
     * @param end the upper bound of the range of l f objective maps (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of l f objective maps
     * @throws SystemException if a system exception occurred
     */
    public List<LFObjectiveMap> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        FinderPath finderPath = null;
        Object[] finderArgs = new Object[] { start, end, orderByComparator };

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<LFObjectiveMap> list = (List<LFObjectiveMap>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_LFOBJECTIVEMAP);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_LFOBJECTIVEMAP;
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (orderByComparator == null) {
                    list = (List<LFObjectiveMap>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);
                } else {
                    list = (List<LFObjectiveMap>) QueryUtil.list(q,
                            getDialect(), start, end);
                }
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (list == null) {
                    FinderCacheUtil.removeResult(finderPath, finderArgs);
                } else {
                    cacheResult(list);

                    FinderCacheUtil.putResult(finderPath, finderArgs, list);
                }

                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the l f objective maps where objectiveID = &#63; from the database.
     *
     * @param objectiveID the objective i d
     * @throws SystemException if a system exception occurred
     */
    public void removeByObjectiveID(Integer objectiveID)
        throws SystemException {
        for (LFObjectiveMap lfObjectiveMap : findByObjectiveID(objectiveID)) {
            remove(lfObjectiveMap);
        }
    }

    /**
     * Removes all the l f objective maps from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    public void removeAll() throws SystemException {
        for (LFObjectiveMap lfObjectiveMap : findAll()) {
            remove(lfObjectiveMap);
        }
    }

    /**
     * Returns the number of l f objective maps where objectiveID = &#63;.
     *
     * @param objectiveID the objective i d
     * @return the number of matching l f objective maps
     * @throws SystemException if a system exception occurred
     */
    public int countByObjectiveID(Integer objectiveID)
        throws SystemException {
        Object[] finderArgs = new Object[] { objectiveID };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_OBJECTIVEID,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_LFOBJECTIVEMAP_WHERE);

            if (objectiveID == null) {
                query.append(_FINDER_COLUMN_OBJECTIVEID_OBJECTIVEID_NULL_2);
            } else {
                query.append(_FINDER_COLUMN_OBJECTIVEID_OBJECTIVEID_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (objectiveID != null) {
                    qPos.add(objectiveID.intValue());
                }

                count = (Long) q.uniqueResult();
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (count == null) {
                    count = Long.valueOf(0);
                }

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_OBJECTIVEID,
                    finderArgs, count);

                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns the number of l f objective maps.
     *
     * @return the number of l f objective maps
     * @throws SystemException if a system exception occurred
     */
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_LFOBJECTIVEMAP);

                count = (Long) q.uniqueResult();
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (count == null) {
                    count = Long.valueOf(0);
                }

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);

                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the l f objective map persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.arcusys.learn.persistence.liferay.model.LFObjectiveMap")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<LFObjectiveMap>> listenersList = new ArrayList<ModelListener<LFObjectiveMap>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<LFObjectiveMap>) InstanceFactory.newInstance(
                            listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(LFObjectiveMapImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
