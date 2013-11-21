package com.qsoft.pilotproject.data.model.entity;


import android.net.Uri;
import android.content.ContentResolver;
import android.provider.BaseColumns;

public final class ProfileCCContract
    implements BaseColumns {
  public static final String AUTHORITY = "com.qsoft.pilotproject";

  public static final String CONTENT_URI_PATH = "profiles";

  public static final String MIMETYPE_TYPE = "profiles";
  public static final String MIMETYPE_NAME = "com.qsoft.pilotproject.provider";

  public static final int CONTENT_URI_PATTERN_MANY = 1;
  public static final int CONTENT_URI_PATTERN_ONE = 2;

  public static final Uri CONTENT_URI = new Uri.Builder().scheme(ContentResolver.SCHEME_CONTENT).authority(AUTHORITY).appendPath(CONTENT_URI_PATH).build();

  private ProfileCCContract() {
  }


  public static final String USERID = "userId";
  public static final String FACEBOOKID = "facebookId";
  public static final String USERNAME = "userName";
  public static final String PASSWORD = "password";
  public static final String AVATAR = "avatar";
  public static final String COVERIMAGE = "coverImage";
  public static final String DISPLAYNAME = "displayName";
  public static final String FULLNAME = "fullName";
  public static final String PHONE = "phone";
  public static final String BIRTHDAY = "birthday";
  public static final String GENDER = "gender";
  public static final String COUNTRYID = "countryId";
  public static final String STORAGEPLANID = "storagePlanId";
  public static final String DESCRIPTION = "description";
  public static final String CREATEDAT = "createdAt";
  public static final String UPDATEDAT = "updatedAt";
  public static final String SOUND = "sound";
  public static final String FAVORITE = "favorite";
  public static final String LIKE = "like";
  public static final String FOLLOWING = "following";
  public static final String AUDIENCE = "audience";
}
