package com.arcusys.learn.persistence.liferay.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link LFPackageScopeRuleLocalService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       LFPackageScopeRuleLocalService
 * @generated
 */
public class LFPackageScopeRuleLocalServiceWrapper
    implements LFPackageScopeRuleLocalService,
        ServiceWrapper<LFPackageScopeRuleLocalService> {
    private LFPackageScopeRuleLocalService _lfPackageScopeRuleLocalService;

    public LFPackageScopeRuleLocalServiceWrapper(
        LFPackageScopeRuleLocalService lfPackageScopeRuleLocalService) {
        _lfPackageScopeRuleLocalService = lfPackageScopeRuleLocalService;
    }

    /**
    * Adds the l f package scope rule to the database. Also notifies the appropriate model listeners.
    *
    * @param lfPackageScopeRule the l f package scope rule
    * @return the l f package scope rule that was added
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFPackageScopeRule addLFPackageScopeRule(
        com.arcusys.learn.persistence.liferay.model.LFPackageScopeRule lfPackageScopeRule)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageScopeRuleLocalService.addLFPackageScopeRule(lfPackageScopeRule);
    }

    /**
    * Creates a new l f package scope rule with the primary key. Does not add the l f package scope rule to the database.
    *
    * @param id the primary key for the new l f package scope rule
    * @return the new l f package scope rule
    */
    public com.arcusys.learn.persistence.liferay.model.LFPackageScopeRule createLFPackageScopeRule(
        long id) {
        return _lfPackageScopeRuleLocalService.createLFPackageScopeRule(id);
    }

    /**
    * Deletes the l f package scope rule with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the l f package scope rule
    * @return the l f package scope rule that was removed
    * @throws PortalException if a l f package scope rule with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFPackageScopeRule deleteLFPackageScopeRule(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageScopeRuleLocalService.deleteLFPackageScopeRule(id);
    }

    /**
    * Deletes the l f package scope rule from the database. Also notifies the appropriate model listeners.
    *
    * @param lfPackageScopeRule the l f package scope rule
    * @return the l f package scope rule that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFPackageScopeRule deleteLFPackageScopeRule(
        com.arcusys.learn.persistence.liferay.model.LFPackageScopeRule lfPackageScopeRule)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageScopeRuleLocalService.deleteLFPackageScopeRule(lfPackageScopeRule);
    }

    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _lfPackageScopeRuleLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageScopeRuleLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageScopeRuleLocalService.dynamicQuery(dynamicQuery,
            start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageScopeRuleLocalService.dynamicQuery(dynamicQuery,
            start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageScopeRuleLocalService.dynamicQueryCount(dynamicQuery);
    }

    public com.arcusys.learn.persistence.liferay.model.LFPackageScopeRule fetchLFPackageScopeRule(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageScopeRuleLocalService.fetchLFPackageScopeRule(id);
    }

    /**
    * Returns the l f package scope rule with the primary key.
    *
    * @param id the primary key of the l f package scope rule
    * @return the l f package scope rule
    * @throws PortalException if a l f package scope rule with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFPackageScopeRule getLFPackageScopeRule(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageScopeRuleLocalService.getLFPackageScopeRule(id);
    }

    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageScopeRuleLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the l f package scope rules.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of l f package scope rules
    * @param end the upper bound of the range of l f package scope rules (not inclusive)
    * @return the range of l f package scope rules
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFPackageScopeRule> getLFPackageScopeRules(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageScopeRuleLocalService.getLFPackageScopeRules(start, end);
    }

    /**
    * Returns the number of l f package scope rules.
    *
    * @return the number of l f package scope rules
    * @throws SystemException if a system exception occurred
    */
    public int getLFPackageScopeRulesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageScopeRuleLocalService.getLFPackageScopeRulesCount();
    }

    /**
    * Updates the l f package scope rule in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param lfPackageScopeRule the l f package scope rule
    * @return the l f package scope rule that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFPackageScopeRule updateLFPackageScopeRule(
        com.arcusys.learn.persistence.liferay.model.LFPackageScopeRule lfPackageScopeRule)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageScopeRuleLocalService.updateLFPackageScopeRule(lfPackageScopeRule);
    }

    /**
    * Updates the l f package scope rule in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param lfPackageScopeRule the l f package scope rule
    * @param merge whether to merge the l f package scope rule with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
    * @return the l f package scope rule that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFPackageScopeRule updateLFPackageScopeRule(
        com.arcusys.learn.persistence.liferay.model.LFPackageScopeRule lfPackageScopeRule,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageScopeRuleLocalService.updateLFPackageScopeRule(lfPackageScopeRule,
            merge);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier() {
        return _lfPackageScopeRuleLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _lfPackageScopeRuleLocalService.setBeanIdentifier(beanIdentifier);
    }

    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _lfPackageScopeRuleLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    public com.arcusys.learn.persistence.liferay.model.LFPackageScopeRule createLFPackageScopeRule()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageScopeRuleLocalService.createLFPackageScopeRule();
    }

    public com.arcusys.learn.persistence.liferay.model.LFPackageScopeRule findByPackageID(
        java.lang.Integer packageID)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFPackageScopeRuleException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageScopeRuleLocalService.findByPackageID(packageID);
    }

    public com.arcusys.learn.persistence.liferay.model.LFPackageScopeRule findByScopeAndIsDefault(
        java.lang.String scope, java.lang.String scopeID,
        java.lang.Boolean isDefault)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFPackageScopeRuleException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageScopeRuleLocalService.findByScopeAndIsDefault(scope,
            scopeID, isDefault);
    }

    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFPackageScopeRule> findByScope(
        java.lang.String scope, java.lang.String scopeID)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFPackageScopeRuleException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageScopeRuleLocalService.findByScope(scope, scopeID);
    }

    public com.arcusys.learn.persistence.liferay.model.LFPackageScopeRule findByPackageIDAndScope(
        java.lang.Integer packageID, java.lang.String scope,
        java.lang.String scopeID)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFPackageScopeRuleException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageScopeRuleLocalService.findByPackageIDAndScope(packageID,
            scope, scopeID);
    }

    public com.arcusys.learn.persistence.liferay.model.LFPackageScopeRule fetchByPackageIDAndScope(
        java.lang.Integer packageID, java.lang.String scope,
        java.lang.String scopeID)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFPackageScopeRuleException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageScopeRuleLocalService.fetchByPackageIDAndScope(packageID,
            scope, scopeID);
    }

    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFPackageScopeRule> findByAllByPackageIDAndScope(
        java.lang.Integer packageID, java.lang.String scope,
        java.lang.String scopeID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageScopeRuleLocalService.findByAllByPackageIDAndScope(packageID,
            scope, scopeID);
    }

    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFPackageScopeRule> findByVisibility(
        java.lang.String scope, java.lang.String scopeID,
        java.lang.Boolean visibility)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageScopeRuleLocalService.findByVisibility(scope, scopeID,
            visibility);
    }

    public com.arcusys.learn.persistence.liferay.model.LFPackageScopeRule removeByPackageID(
        java.lang.Integer packageID)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFPackageScopeRuleException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageScopeRuleLocalService.removeByPackageID(packageID);
    }

    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        _lfPackageScopeRuleLocalService.removeAll();
    }

    /**
     * @deprecated Renamed to {@link #getWrappedService}
     */
    public LFPackageScopeRuleLocalService getWrappedLFPackageScopeRuleLocalService() {
        return _lfPackageScopeRuleLocalService;
    }

    /**
     * @deprecated Renamed to {@link #setWrappedService}
     */
    public void setWrappedLFPackageScopeRuleLocalService(
        LFPackageScopeRuleLocalService lfPackageScopeRuleLocalService) {
        _lfPackageScopeRuleLocalService = lfPackageScopeRuleLocalService;
    }

    public LFPackageScopeRuleLocalService getWrappedService() {
        return _lfPackageScopeRuleLocalService;
    }

    public void setWrappedService(
        LFPackageScopeRuleLocalService lfPackageScopeRuleLocalService) {
        _lfPackageScopeRuleLocalService = lfPackageScopeRuleLocalService;
    }
}
