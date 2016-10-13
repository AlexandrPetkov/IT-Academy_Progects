package TestWebProject.bean.dao;

import TestWebProject.bean.dao.impl.FileNBDao;

public class DAOFactory {
    private static final DAOFactory INSTANCE = new DAOFactory();

    private NBDao nbDao = new FileNBDao();

    private DAOFactory() {
    }

    public static DAOFactory getInstance(){
        return INSTANCE;
    }

    public NBDao getNbDao() {
        return nbDao;
    }
}
