package AbstaractionInterface.collectionHierarchy;

import java.util.ArrayList;
import java.util.List;

public abstract class Collection  {
    private static final int maxSize = 100;
    protected List<String> items;
    protected Collection() {
        items = new ArrayList<>();
    }
    public int getSize() {
        return this.items.size();
    }

}
