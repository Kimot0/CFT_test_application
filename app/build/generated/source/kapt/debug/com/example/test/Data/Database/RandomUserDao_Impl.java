package com.example.test.Data.Database;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.EntityUpsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.test.Data.Remote.Entity.DBRandomUser;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RandomUserDao_Impl implements RandomUserDao {
  private final RoomDatabase __db;

  private final SharedSQLiteStatement __preparedStmtOfDropTableList;

  private final EntityUpsertionAdapter<DBRandomUser> __upsertionAdapterOfDBRandomUser;

  public RandomUserDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__preparedStmtOfDropTableList = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "Delete from RandomUsers";
        return _query;
      }
    };
    this.__upsertionAdapterOfDBRandomUser = new EntityUpsertionAdapter<DBRandomUser>(new EntityInsertionAdapter<DBRandomUser>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT INTO `RandomUsers` (`id`,`gender`,`photo`,`fio`,`phone`,`address`,`email`,`dob`,`age`,`nat`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final DBRandomUser entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getGender() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getGender());
        }
        if (entity.getPhoto() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getPhoto());
        }
        if (entity.getFio() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getFio());
        }
        if (entity.getPhone() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getPhone());
        }
        if (entity.getAddress() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getAddress());
        }
        if (entity.getEmail() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getEmail());
        }
        if (entity.getDob() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getDob());
        }
        if (entity.getAge() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getAge());
        }
        if (entity.getNat() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getNat());
        }
      }
    }, new EntityDeletionOrUpdateAdapter<DBRandomUser>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE `RandomUsers` SET `id` = ?,`gender` = ?,`photo` = ?,`fio` = ?,`phone` = ?,`address` = ?,`email` = ?,`dob` = ?,`age` = ?,`nat` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final DBRandomUser entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getGender() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getGender());
        }
        if (entity.getPhoto() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getPhoto());
        }
        if (entity.getFio() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getFio());
        }
        if (entity.getPhone() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getPhone());
        }
        if (entity.getAddress() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getAddress());
        }
        if (entity.getEmail() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getEmail());
        }
        if (entity.getDob() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getDob());
        }
        if (entity.getAge() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getAge());
        }
        if (entity.getNat() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getNat());
        }
        statement.bindLong(11, entity.getId());
      }
    });
  }

  @Override
  public Object dropTableList(final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDropTableList.acquire();
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfDropTableList.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object insertNewUsers(final DBRandomUser user,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __upsertionAdapterOfDBRandomUser.upsert(user);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object getFullUserInfo(final Continuation<? super List<DBRandomUser>> $completion) {
    final String _sql = "Select * from RandomUsers";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<DBRandomUser>>() {
      @Override
      @NonNull
      public List<DBRandomUser> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
          final int _cursorIndexOfPhoto = CursorUtil.getColumnIndexOrThrow(_cursor, "photo");
          final int _cursorIndexOfFio = CursorUtil.getColumnIndexOrThrow(_cursor, "fio");
          final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
          final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfDob = CursorUtil.getColumnIndexOrThrow(_cursor, "dob");
          final int _cursorIndexOfAge = CursorUtil.getColumnIndexOrThrow(_cursor, "age");
          final int _cursorIndexOfNat = CursorUtil.getColumnIndexOrThrow(_cursor, "nat");
          final List<DBRandomUser> _result = new ArrayList<DBRandomUser>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final DBRandomUser _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpGender;
            if (_cursor.isNull(_cursorIndexOfGender)) {
              _tmpGender = null;
            } else {
              _tmpGender = _cursor.getString(_cursorIndexOfGender);
            }
            final String _tmpPhoto;
            if (_cursor.isNull(_cursorIndexOfPhoto)) {
              _tmpPhoto = null;
            } else {
              _tmpPhoto = _cursor.getString(_cursorIndexOfPhoto);
            }
            final String _tmpFio;
            if (_cursor.isNull(_cursorIndexOfFio)) {
              _tmpFio = null;
            } else {
              _tmpFio = _cursor.getString(_cursorIndexOfFio);
            }
            final String _tmpPhone;
            if (_cursor.isNull(_cursorIndexOfPhone)) {
              _tmpPhone = null;
            } else {
              _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
            }
            final String _tmpAddress;
            if (_cursor.isNull(_cursorIndexOfAddress)) {
              _tmpAddress = null;
            } else {
              _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
            }
            final String _tmpEmail;
            if (_cursor.isNull(_cursorIndexOfEmail)) {
              _tmpEmail = null;
            } else {
              _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            }
            final String _tmpDob;
            if (_cursor.isNull(_cursorIndexOfDob)) {
              _tmpDob = null;
            } else {
              _tmpDob = _cursor.getString(_cursorIndexOfDob);
            }
            final String _tmpAge;
            if (_cursor.isNull(_cursorIndexOfAge)) {
              _tmpAge = null;
            } else {
              _tmpAge = _cursor.getString(_cursorIndexOfAge);
            }
            final String _tmpNat;
            if (_cursor.isNull(_cursorIndexOfNat)) {
              _tmpNat = null;
            } else {
              _tmpNat = _cursor.getString(_cursorIndexOfNat);
            }
            _item = new DBRandomUser(_tmpId,_tmpGender,_tmpPhoto,_tmpFio,_tmpPhone,_tmpAddress,_tmpEmail,_tmpDob,_tmpAge,_tmpNat);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
