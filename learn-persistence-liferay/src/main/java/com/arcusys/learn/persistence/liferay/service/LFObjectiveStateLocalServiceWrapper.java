package com.arcusys.learn.persistence.liferay.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link LFObjectiveStateLocalService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       LFObjectiveStateLocalService
 * @generated
 */
public class LFObjectiveStateLocalServiceWrapper
    implements LFObjectiveStateLocalService,
        ServiceWrapper<LFObjectiveStateLocalService> {
    private LFObjectiveStateLocalService _lfObjectiveStateLocalService;

    public LFObjectiveStateLocalServiceWrapper(
        LFObjectiveStateLocalService lfObjectiveStateLocalService) {
        _lfObjectiveStateLocalService = lfObjectiveStateLocalService;
    }

    /**
    * Adds the l f objective state to the database. Also notifies the appropriate model listeners.
    *
    * @param lfObjectiveState the l f objective state
    * @return the l f objective state that was added
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFObjectiveState addLFObjectiveState(
        com.arcusys.learn.persistence.liferay.model.LFObjectiveState lfObjectiveState)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfObjectiveStateLocalService.addLFObjectiveState(lfObjectiveState);
    }

    /**
    * Creates a new l f objective state with the primary key. Does not add the l f objective state to the database.
    *
    * @param id the primary key for the new l f objective state
    * @return the new l f objective state
    */
    public com.arcusys.learn.persistence.liferay.model.LFObjectiveState createLFObjectiveState(
        long id) {
        return _lfObjectiveStateLocalService.createLFObjectiveState(id);
    }

    /**
    * Deletes the l f objective state with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the l f objective state
    * @return the l f objective state that was removed
    * @throws PortalException if a l f objective state with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFObjectiveState deleteLFObjectiveState(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lfObjectiveStateLocalService.deleteLFObjectiveState(id);
    }

    /**
    * Deletes the l f objective state from the database. Also notifies the appropriate model listeners.
    *
    * @param lfObjectiveState the l f objective state
    * @return the l f objective state that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFObjectiveState deleteLFObjectiveState(
        com.arcusys.learn.persistence.liferay.model.LFObjectiveState lfObjectiveState)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfObjectiveStateLocalService.deleteLFObjectiveState(lfObjectiveState);
    }

    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _lfObjectiveStateLocalService.dynamicQuery();
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
        return _lfObjectiveStateLocalService.dynamicQuery(dynamicQuery);
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
        return _lfObjectiveStateLocalService.dynamicQuery(dynamicQuery, start,
            end);
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
        return _lfObjectiveStateLocalService.dynamicQuery(dynamicQuery, start,
            end, orderByComparator);
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
        return _lfObjectiveStateLocalService.dynamicQueryCount(dynamicQuery);
    }

    public com.arcusys.learn.persistence.liferay.model.LFObjectiveState fetchLFObjectiveState(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return _lfObjectiveStateLocalService.fetchLFObjectiveState(id);
    }

    /**
    * Returns the l f objective state with the primary key.
    *
    * @param id the primary key of the l f objective state
    * @return the l f objective state
    * @throws PortalException if a l f objective state with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFObjectiveState getLFObjectiveState(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lfObjectiveStateLocalService.getLFObjectiveState(id);
    }

    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lfObjectiveStateLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the l f objective states.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of l f objective states
    * @param end the upper bound of the range of l f objective states (not inclusive)
    * @return the range of l f objective states
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFObjectiveState> getLFObjectiveStates(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfObjectiveStateLocalService.getLFObjectiveStates(start, end);
    }

    /**
    * Returns the number of l f objective states.
    *
    * @return the number of l f objective states
    * @throws SystemException if a system exception occurred
    */
    public int getLFObjectiveStatesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfObjectiveStateLocalService.getLFObjectiveStatesCount();
    }

    /**
    * Updates the l f objective state in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param lfObjectiveState the l f objective state
    * @return the l f objective state that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFObjectiveState updateLFObjectiveState(
        com.arcusys.learn.persistence.liferay.model.LFObjectiveState lfObjectiveState)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfObjectiveStateLocalService.updateLFObjectiveState(lfObjectiveState);
    }

    /**
    * Updates the l f objective state in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param lfObjectiveState the l f objective state
    * @param merge whether to merge the l f objective state with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
    * @return the l f objective state that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFObjectiveState updateLFObjectiveState(
        com.arcusys.learn.persistence.liferay.model.LFObjectiveState lfObjectiveState,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfObjectiveStateLocalService.updateLFObjectiveState(lfObjectiveState,
            merge);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier() {
        return _lfObjectiveStateLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _lfObjectiveStateLocalService.setBeanIdentifier(beanIdentifier);
    }

    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _lfObjectiveStateLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    public com.arcusys.learn.persistence.liferay.model.LFObjectiveState createLFObjectiveState()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfObjectiveStateLocalService.createLFObjectiveState();
    }

    public com.arcusys.learn.persistence.liferay.model.LFObjectiveState findByMapKeyAndActivityStateID(
        java.lang.String mapKey, java.lang.Integer activityStateID)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFObjectiveException,
            com.arcusys.learn.persistence.liferay.NoSuchLFObjectiveStateException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lfObjectiveStateLocalService.findByMapKeyAndActivityStateID(mapKey,
            activityStateID);
    }

    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFObjectiveState> findByActivityStateID(
        java.lang.Integer activityStateID, int start, int end)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFObjectiveException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lfObjectiveStateLocalService.findByActivityStateID(activityStateID,
            start, end);
    }

    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        _lfObjectiveStateLocalService.removeAll();
    }

    /**
     * @deprecated Renamed to {@link #getWrappedService}
     */
    public LFObjectiveStateLocalService getWrappedLFObjectiveStateLocalService() {
        return _lfObjectiveStateLocalService;
    }

    /**
     * @deprecated Renamed to {@link #setWrappedService}
     */
    public void setWrappedLFObjectiveStateLocalService(
        LFObjectiveStateLocalService lfObjectiveStateLocalService) {
        _lfObjectiveStateLocalService = lfObjectiveStateLocalService;
    }

    public LFObjectiveStateLocalService getWrappedService() {
        return _lfObjectiveStateLocalService;
    }

    public void setWrappedService(
        LFObjectiveStateLocalService lfObjectiveStateLocalService) {
        _lfObjectiveStateLocalService = lfObjectiveStateLocalService;
    }
}
