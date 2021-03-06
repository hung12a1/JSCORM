package com.arcusys.learn.persistence.liferay.model.impl;

import com.arcusys.learn.persistence.liferay.model.LFChildrenSelection;
import com.arcusys.learn.persistence.liferay.service.LFChildrenSelectionLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the LFChildrenSelection service. Represents a row in the &quot;Learn_LFChildrenSelection&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LFChildrenSelectionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFChildrenSelectionImpl
 * @see com.arcusys.learn.persistence.liferay.model.LFChildrenSelection
 * @generated
 */
public abstract class LFChildrenSelectionBaseImpl
    extends LFChildrenSelectionModelImpl implements LFChildrenSelection {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a l f children selection model instance should use the {@link LFChildrenSelection} interface instead.
     */
    public void persist() throws SystemException {
        if (this.isNew()) {
            LFChildrenSelectionLocalServiceUtil.addLFChildrenSelection(this);
        } else {
            LFChildrenSelectionLocalServiceUtil.updateLFChildrenSelection(this);
        }
    }
}
