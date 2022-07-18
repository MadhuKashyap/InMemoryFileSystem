package service.impl;

import service.Entry;

import java.util.ArrayList;
import java.util.Arrays;

public class Directory extends Entry {
    ArrayList<Entry> content;
    Directory(Directory parent, String name)
    {
        super(parent, name);
        content = new ArrayList<>();
    }

    @Override
    public boolean delete()
    {
        if(parent == null)
            return false;
        parent.removeFile(this);
        return  true;
    }

    public boolean addEntry(Entry e)
    {
        if(content.contains(e))
            return false;
        content.add(e);
        return true;
    }

    public boolean removeFile(Entry e)
    {
        if(!content.contains(e))
            return false;
        content.contains(e);
        return true;
    }

    @Override public int size() {
        int size = 0;
        for(Entry e : content)
        {
            if(e instanceof Directory)
                size += e.size();
            else
                size ++;
        }
        return size;
    }
}
