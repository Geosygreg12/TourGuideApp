package com.example.android.tourguideapp;

/* private variables are used to hold the image resource id for the imageviews populated to the
recycler view
* */
class info {
    private int mImageAddress;
    private int mFirstImageAddress = -1;
    private int mSecondAddress = -1;
    private String mTitle;
    private final int CODE = -1;
    private boolean pass;
    private String mLocationAddress;

    //public constructor which requires 3 image resource, a hotel title an the hotel location
    //the location is used to contruct the uri used for the gogle maps intent
    public info(int imageList, int firstImage, int secondImage, String title, String location) {
        mImageAddress = imageList;
        mTitle = title;
        mFirstImageAddress = firstImage;
        mSecondAddress = secondImage;
        if (location.equalsIgnoreCase("Enugu")) {
            mLocationAddress = "geo:6.6069,7.5247?q=";
        } else if (location.equalsIgnoreCase("Cross River")) {
            mLocationAddress = "geo:6.1670,8.6601?q=";
        } else if (location.equalsIgnoreCase("lagos")) {
            mLocationAddress = "geo:6.6080,3.6218?q=";
        }
    }

    //a second constructor is used for the touristattractions activity snd super markets which require only an image resource id,
    // the title and the location of the building
    public info(int imageResourceId, String title, String location) {
        mImageAddress = imageResourceId;
        mTitle = title;
        if (location.equalsIgnoreCase("Enugu")) {
            mLocationAddress = "geo:6.6069,7.5247?q=";
        } else if (location.equalsIgnoreCase("Cross River")) {
            mLocationAddress = "geo:6.1670,8.6601?q=";
        } else if (location.equalsIgnoreCase("lagos")) {
            mLocationAddress = "geo:6.6080,3.6218?q=";
        }
    }

    //public getter methods to return the object info or state
    public String getmLocationAddress() {
        return mLocationAddress;
    }

    public boolean getCODE() {
        if ((mImageAddress != CODE) && (mFirstImageAddress != CODE)) {
            pass = true;
        } else {
            pass = false;
        }
        return pass;
    }

    public String getmTitle() {
        return mTitle;
    }

    public int getmFirstImageAddress() {
        return mFirstImageAddress;
    }

    public int getmSecondAddress() {
        return mSecondAddress;
    }

    public int getImageAddress() {
        return mImageAddress;
    }
}
