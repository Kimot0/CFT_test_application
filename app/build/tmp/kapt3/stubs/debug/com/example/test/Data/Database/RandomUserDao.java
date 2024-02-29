package com.example.test.Data.Database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/example/test/Data/Database/RandomUserDao;", "", "dropTableList", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFullUserInfo", "", "Lcom/example/test/Data/Remote/Entity/DBRandomUser;", "insertNewUsers", "user", "(Lcom/example/test/Data/Remote/Entity/DBRandomUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao
public abstract interface RandomUserDao {
    
    @androidx.room.Query(value = "Select * from RandomUsers")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getFullUserInfo(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.test.Data.Remote.Entity.DBRandomUser>> $completion);
    
    @androidx.room.Upsert
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertNewUsers(@org.jetbrains.annotations.NotNull
    com.example.test.Data.Remote.Entity.DBRandomUser user, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "Delete from RandomUsers")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object dropTableList(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}