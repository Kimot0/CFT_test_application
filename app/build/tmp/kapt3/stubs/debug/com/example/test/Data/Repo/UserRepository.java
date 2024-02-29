package com.example.test.Data.Repo;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/example/test/Data/Repo/UserRepository;", "Lcom/example/test/Domain/Repo/IUserRepository;", "source", "Lcom/example/test/Data/DataSource/RemoteDataSource;", "database", "Lcom/example/test/Data/Database/AppDatabase;", "(Lcom/example/test/Data/DataSource/RemoteDataSource;Lcom/example/test/Data/Database/AppDatabase;)V", "getRandomUser", "", "Lcom/example/test/Domain/Entity/RandomUser;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRandomUserFromDatabase", "insertRandomUserInDatabase", "", "user", "Lcom/example/test/Data/Remote/Entity/DBRandomUser;", "(Lcom/example/test/Data/Remote/Entity/DBRandomUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUsersList", "app_debug"})
public final class UserRepository implements com.example.test.Domain.Repo.IUserRepository {
    @org.jetbrains.annotations.NotNull
    private final com.example.test.Data.DataSource.RemoteDataSource source = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.test.Data.Database.AppDatabase database = null;
    
    public UserRepository(@org.jetbrains.annotations.NotNull
    com.example.test.Data.DataSource.RemoteDataSource source, @org.jetbrains.annotations.NotNull
    com.example.test.Data.Database.AppDatabase database) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getRandomUser(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.test.Domain.Entity.RandomUser>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getRandomUserFromDatabase(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.test.Domain.Entity.RandomUser>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object insertRandomUserInDatabase(@org.jetbrains.annotations.NotNull
    com.example.test.Data.Remote.Entity.DBRandomUser user, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object updateUsersList(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.test.Domain.Entity.RandomUser>> $completion) {
        return null;
    }
}