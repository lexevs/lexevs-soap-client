package gov.nih.nci.lexevsapi60.lexevsapi60.services.lexevsapi60Service;

import org.LexGrid.concepts.Entity;

public class LexEVSWSQueryImplProxy implements
        gov.nih.nci.lexevsapi60.lexevsapi60.services.lexevsapi60Service.LexEVSWSQueryImpl {
    private String _endpoint = null;
    private gov.nih.nci.lexevsapi60.lexevsapi60.services.lexevsapi60Service.LexEVSWSQueryImpl lexEVSWSQueryImpl = null;

    public static void main(String... args) throws Exception {
        LexEVSWSQueryImplProxy p = new LexEVSWSQueryImplProxy();
        Entity e = new Entity();
        e.setEntityCode("C12727");

        Object[] obj = p.getLexEVSWSQueryImpl().queryObject(Entity.class.getName(), e);
        System.out.println(((Entity) obj[0]).getEntityCode());
    }

    public LexEVSWSQueryImplProxy() {
        _initLexEVSWSQueryImplProxy();
    }

    public LexEVSWSQueryImplProxy(String endpoint) {
        _endpoint = endpoint;
        _initLexEVSWSQueryImplProxy();
    }

    private void _initLexEVSWSQueryImplProxy() {
        try {
            lexEVSWSQueryImpl = (new gov.nih.nci.lexevsapi60.lexevsapi60.services.lexevsapi60Service.LexEVSWSQueryImplServiceLocator())
                    .getlexevsapi60Service();
            if (lexEVSWSQueryImpl != null) {
                if (_endpoint != null)
                    ((javax.xml.rpc.Stub) lexEVSWSQueryImpl)._setProperty(
                            "javax.xml.rpc.service.endpoint.address", _endpoint);
                else
                    _endpoint = (String) ((javax.xml.rpc.Stub) lexEVSWSQueryImpl)
                            ._getProperty("javax.xml.rpc.service.endpoint.address");
            }

        } catch (javax.xml.rpc.ServiceException serviceException) {
        }
    }

    public String getEndpoint() {
        return _endpoint;
    }

    public void setEndpoint(String endpoint) {
        _endpoint = endpoint;
        if (lexEVSWSQueryImpl != null)
            ((javax.xml.rpc.Stub) lexEVSWSQueryImpl)._setProperty(
                    "javax.xml.rpc.service.endpoint.address", _endpoint);

    }

    public gov.nih.nci.lexevsapi60.lexevsapi60.services.lexevsapi60Service.LexEVSWSQueryImpl getLexEVSWSQueryImpl() {
        if (lexEVSWSQueryImpl == null)
            _initLexEVSWSQueryImplProxy();
        return lexEVSWSQueryImpl;
    }

    @Override
    public java.lang.Object[] query(java.lang.String targetClassName, java.lang.Object criteria,
            int startIndex) throws java.rmi.RemoteException {
        if (lexEVSWSQueryImpl == null)
            _initLexEVSWSQueryImplProxy();
        return lexEVSWSQueryImpl.query(targetClassName, criteria, startIndex);
    }

    @Override
    public java.lang.String getVersion() throws java.rmi.RemoteException {
        if (lexEVSWSQueryImpl == null)
            _initLexEVSWSQueryImplProxy();
        return lexEVSWSQueryImpl.getVersion();
    }

    @Override
    public java.lang.Object[] getAssociation(java.lang.Object source,
            java.lang.String associationName, int startIndex) throws java.rmi.RemoteException {
        if (lexEVSWSQueryImpl == null)
            _initLexEVSWSQueryImplProxy();
        return lexEVSWSQueryImpl.getAssociation(source, associationName, startIndex);
    }

    @Override
    public int getRecordsPerQuery() throws java.rmi.RemoteException {
        if (lexEVSWSQueryImpl == null)
            _initLexEVSWSQueryImplProxy();
        return lexEVSWSQueryImpl.getRecordsPerQuery();
    }

    @Override
    public int getMaximumRecordsPerQuery() throws java.rmi.RemoteException {
        if (lexEVSWSQueryImpl == null)
            _initLexEVSWSQueryImplProxy();
        return lexEVSWSQueryImpl.getMaximumRecordsPerQuery();
    }

    @Override
    public int getTotalNumberOfRecords(java.lang.String targetClassName, java.lang.Object criteria)
            throws java.rmi.RemoteException {
        if (lexEVSWSQueryImpl == null)
            _initLexEVSWSQueryImplProxy();
        return lexEVSWSQueryImpl.getTotalNumberOfRecords(targetClassName, criteria);
    }

    @Override
    public java.lang.Object[] queryObject(java.lang.String targetClassName,
            java.lang.Object criteria) throws java.rmi.RemoteException {
        if (lexEVSWSQueryImpl == null)
            _initLexEVSWSQueryImplProxy();
        return lexEVSWSQueryImpl.queryObject(targetClassName, criteria);
    }

}