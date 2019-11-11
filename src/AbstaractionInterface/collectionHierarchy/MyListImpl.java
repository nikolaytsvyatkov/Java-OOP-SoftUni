package AbstaractionInterface.collectionHierarchy;

public class MyListImpl extends Collection implements MyList {
    @Override
    public int getUsed() {
        return items.size();
    }

    @Override
    public String remove() {
        return items.remove(0);
    }

    @Override
    public int add(String string) {
        items.add(0, string);
        return items.indexOf(string);
    }
}
