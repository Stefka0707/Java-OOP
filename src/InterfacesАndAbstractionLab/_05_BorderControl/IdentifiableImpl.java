package InterfacesАndAbstractionLab._05_BorderControl;

public abstract class IdentifiableImpl implements Identifiable{

    private String id;

    protected IdentifiableImpl(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }
}
