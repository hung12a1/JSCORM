package com.arcusys.learn.persistence.liferay.service.base;

import com.arcusys.learn.persistence.liferay.service.LFActivityDataMapLocalServiceUtil;

import java.util.Arrays;


public class LFActivityDataMapLocalServiceClpInvoker {
    private String _methodName0;
    private String[] _methodParameterTypes0;
    private String _methodName1;
    private String[] _methodParameterTypes1;
    private String _methodName2;
    private String[] _methodParameterTypes2;
    private String _methodName3;
    private String[] _methodParameterTypes3;
    private String _methodName4;
    private String[] _methodParameterTypes4;
    private String _methodName5;
    private String[] _methodParameterTypes5;
    private String _methodName6;
    private String[] _methodParameterTypes6;
    private String _methodName7;
    private String[] _methodParameterTypes7;
    private String _methodName8;
    private String[] _methodParameterTypes8;
    private String _methodName9;
    private String[] _methodParameterTypes9;
    private String _methodName10;
    private String[] _methodParameterTypes10;
    private String _methodName11;
    private String[] _methodParameterTypes11;
    private String _methodName12;
    private String[] _methodParameterTypes12;
    private String _methodName13;
    private String[] _methodParameterTypes13;
    private String _methodName14;
    private String[] _methodParameterTypes14;
    private String _methodName15;
    private String[] _methodParameterTypes15;
    private String _methodName164;
    private String[] _methodParameterTypes164;
    private String _methodName165;
    private String[] _methodParameterTypes165;
    private String _methodName170;
    private String[] _methodParameterTypes170;
    private String _methodName171;
    private String[] _methodParameterTypes171;
    private String _methodName172;
    private String[] _methodParameterTypes172;
    private String _methodName173;
    private String[] _methodParameterTypes173;
    private String _methodName174;
    private String[] _methodParameterTypes174;

    public LFActivityDataMapLocalServiceClpInvoker() {
        _methodName0 = "addLFActivityDataMap";

        _methodParameterTypes0 = new String[] {
                "com.arcusys.learn.persistence.liferay.model.LFActivityDataMap"
            };

        _methodName1 = "createLFActivityDataMap";

        _methodParameterTypes1 = new String[] { "long" };

        _methodName2 = "deleteLFActivityDataMap";

        _methodParameterTypes2 = new String[] { "long" };

        _methodName3 = "deleteLFActivityDataMap";

        _methodParameterTypes3 = new String[] {
                "com.arcusys.learn.persistence.liferay.model.LFActivityDataMap"
            };

        _methodName4 = "dynamicQuery";

        _methodParameterTypes4 = new String[] {  };

        _methodName5 = "dynamicQuery";

        _methodParameterTypes5 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName6 = "dynamicQuery";

        _methodParameterTypes6 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
            };

        _methodName7 = "dynamicQuery";

        _methodParameterTypes7 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
                "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName8 = "dynamicQueryCount";

        _methodParameterTypes8 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName9 = "fetchLFActivityDataMap";

        _methodParameterTypes9 = new String[] { "long" };

        _methodName10 = "getLFActivityDataMap";

        _methodParameterTypes10 = new String[] { "long" };

        _methodName11 = "getPersistedModel";

        _methodParameterTypes11 = new String[] { "java.io.Serializable" };

        _methodName12 = "getLFActivityDataMaps";

        _methodParameterTypes12 = new String[] { "int", "int" };

        _methodName13 = "getLFActivityDataMapsCount";

        _methodParameterTypes13 = new String[] {  };

        _methodName14 = "updateLFActivityDataMap";

        _methodParameterTypes14 = new String[] {
                "com.arcusys.learn.persistence.liferay.model.LFActivityDataMap"
            };

        _methodName15 = "updateLFActivityDataMap";

        _methodParameterTypes15 = new String[] {
                "com.arcusys.learn.persistence.liferay.model.LFActivityDataMap",
                "boolean"
            };

        _methodName164 = "getBeanIdentifier";

        _methodParameterTypes164 = new String[] {  };

        _methodName165 = "setBeanIdentifier";

        _methodParameterTypes165 = new String[] { "java.lang.String" };

        _methodName170 = "createLFAttemptData";

        _methodParameterTypes170 = new String[] {  };

        _methodName171 = "findByPackageIDAndActivityID";

        _methodParameterTypes171 = new String[] {
                "java.lang.Integer", "java.lang.String"
            };

        _methodName172 = "removeByPackageIDAndActivityID";

        _methodParameterTypes172 = new String[] {
                "java.lang.Integer", "java.lang.String"
            };

        _methodName173 = "removeAll";

        _methodParameterTypes173 = new String[] {  };

        _methodName174 = "getLFActivityDataMap";

        _methodParameterTypes174 = new String[] { "long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return LFActivityDataMapLocalServiceUtil.addLFActivityDataMap((com.arcusys.learn.persistence.liferay.model.LFActivityDataMap) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return LFActivityDataMapLocalServiceUtil.createLFActivityDataMap(((Long) arguments[0]).longValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return LFActivityDataMapLocalServiceUtil.deleteLFActivityDataMap(((Long) arguments[0]).longValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return LFActivityDataMapLocalServiceUtil.deleteLFActivityDataMap((com.arcusys.learn.persistence.liferay.model.LFActivityDataMap) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return LFActivityDataMapLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return LFActivityDataMapLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return LFActivityDataMapLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return LFActivityDataMapLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return LFActivityDataMapLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return LFActivityDataMapLocalServiceUtil.fetchLFActivityDataMap(((Long) arguments[0]).longValue());
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return LFActivityDataMapLocalServiceUtil.getLFActivityDataMap(((Long) arguments[0]).longValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return LFActivityDataMapLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return LFActivityDataMapLocalServiceUtil.getLFActivityDataMaps(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return LFActivityDataMapLocalServiceUtil.getLFActivityDataMapsCount();
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return LFActivityDataMapLocalServiceUtil.updateLFActivityDataMap((com.arcusys.learn.persistence.liferay.model.LFActivityDataMap) arguments[0]);
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return LFActivityDataMapLocalServiceUtil.updateLFActivityDataMap((com.arcusys.learn.persistence.liferay.model.LFActivityDataMap) arguments[0],
                ((Boolean) arguments[1]).booleanValue());
        }

        if (_methodName164.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes164, parameterTypes)) {
            return LFActivityDataMapLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName165.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes165, parameterTypes)) {
            LFActivityDataMapLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName170.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes170, parameterTypes)) {
            return LFActivityDataMapLocalServiceUtil.createLFAttemptData();
        }

        if (_methodName171.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes171, parameterTypes)) {
            return LFActivityDataMapLocalServiceUtil.findByPackageIDAndActivityID((java.lang.Integer) arguments[0],
                (java.lang.String) arguments[1]);
        }

        if (_methodName172.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes172, parameterTypes)) {
            LFActivityDataMapLocalServiceUtil.removeByPackageIDAndActivityID((java.lang.Integer) arguments[0],
                (java.lang.String) arguments[1]);

            return null;
        }

        if (_methodName173.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes173, parameterTypes)) {
            LFActivityDataMapLocalServiceUtil.removeAll();

            return null;
        }

        if (_methodName174.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes174, parameterTypes)) {
            return LFActivityDataMapLocalServiceUtil.getLFActivityDataMap(((Long) arguments[0]).longValue());
        }

        throw new UnsupportedOperationException();
    }
}
