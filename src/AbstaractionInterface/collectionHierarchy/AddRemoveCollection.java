package AbstaractionInterface.collectionHierarchy;

public class AddRemoveCollection extends Collection implements AddRemovable {
    @Override
    public String remove() {
        return items.remove(items.size() - 1);
    }

    @Override
    public int add(String string) {
        items.add(0,string);
        return 0;
    }

}
