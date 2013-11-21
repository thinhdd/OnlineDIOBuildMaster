package com.qsoft.pilotproject.data.model.entity;


import android.net.Uri;
import android.content.ContentResolver;
import android.provider.BaseColumns;

public final class FeedCCContract
    implements BaseColumns {
  public static final String AUTHORITY = "com.qsoft.pilotproject";

  public static final String CONTENT_URI_PATH = "feeds";

  public static final String MIMETYPE_TYPE = "feeds";
  public static final String MIMETYPE_NAME = "com.qsoft.pilotproject.provider";

  public static final int CONTENT_URI_PATTERN_MANY = 5;
  public static final int CONTENT_URI_PATTERN_ONE = 6;

  public static final Uri CONTENT_URI = new Uri.Builder().scheme(ContentResolver.SCHEME_CONTENT).authority(AUTHORITY).appendPath(CONTENT_URI_PATH).build();

  private FeedCCContract() {
  }


  public static final String FEEDID = "feedId";
  public static final String USERID = "userId";
  public static final String TITLE = "title";
  public static final String THUMBNAIL = "thumbnail";
  public static final String DESCRIPTION = "description";
  public static final String SOUNDPATH = "soundPath";
  public static final String DURATION = "duration";
  public static final String PLAYED = "played";
  public static final String CREATEDAT = "createdAt";
  public static final String UPDATEDAT = "updatedAt";
  public static final String LIKES = "likes";
  public static final String VIEWED = "viewed";
  public static final String COMMENTS = "comments";
  public static final String USERNAME = "userName";
  public static final String DISPLAYNAME = "displayName";
  public static final String AVATAR = "avatar";
}
