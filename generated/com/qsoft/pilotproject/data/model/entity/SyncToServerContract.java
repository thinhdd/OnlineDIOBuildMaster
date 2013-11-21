package com.qsoft.pilotproject.data.model.entity;


import android.net.Uri;
import android.content.ContentResolver;
import android.provider.BaseColumns;

public final class SyncToServerContract
    implements BaseColumns {
  public static final String AUTHORITY = "com.qsoft.pilotproject";

  public static final String CONTENT_URI_PATH = "sync_to_server";

  public static final String MIMETYPE_TYPE = "sync_to_server";
  public static final String MIMETYPE_NAME = "com.qsoft.pilotproject.provider";

  public static final int CONTENT_URI_PATTERN_MANY = 7;
  public static final int CONTENT_URI_PATTERN_ONE = 8;

  public static final Uri CONTENT_URI = new Uri.Builder().scheme(ContentResolver.SCHEME_CONTENT).authority(AUTHORITY).appendPath(CONTENT_URI_PATH).build();

  private SyncToServerContract() {
  }


  public static final String TABLENAME = "tableName";
  public static final String RECORDID = "recordId";
  public static final String GROUPS = "groupS";
  public static final String PRIORITY = "priority";
  public static final String ACTION = "action";
  public static final String STATUS = "status";
}
