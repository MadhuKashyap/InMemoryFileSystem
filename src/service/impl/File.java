package service.impl;

import service.Entry;

public class File extends Entry {
    int size;
    String content;
    File(Directory parent, String name)
    {
        super(parent, name);
    }

    @Override
    public boolean delete()
    {
        if(parent == null)
            return false;
        parent.removeFile(this);
        return  true;
    }

    @Override public int size() {
        return size;
    }
}
