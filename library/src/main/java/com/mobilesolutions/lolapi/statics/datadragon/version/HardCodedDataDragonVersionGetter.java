package com.mobilesolutions.lolapi.statics.datadragon.version;

import com.mobilesolutions.lolapi.statics.datadragon.DataDragonVersionGetter;

/**
 * This is hardcoded version to be able to use for all regions.
 * <p/>
 * Created by georgi.eftimov on 12/06/2015.
 */

public class HardCodedDataDragonVersionGetter implements DataDragonVersionGetter {

    private final String version;

    public HardCodedDataDragonVersionGetter(final String version) {
        this.version = version;
    }

    @Override
    public String getVersion() {
        return version;
    }
}
