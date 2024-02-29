package com.example.test.Data.Repo;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/example/test/Data/Repo/UserRepository;", "Lcom/example/test/Domain/Repo/IUserRepository;", "()V", "getRandomUser", "", "Lcom/example/test/Data/Remote/Entity/TempPerson;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRandomUserFromDatabase", "insertRandomUserInDatabase", "", "user", "Lcom/example/test/Data/Remote/Entity/ApiRandomUser;", "(Lcom/example/test/Data/Remote/Entity/ApiRandomUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public final class UserRepository implements com.example.test.Domain.Repo.IUserRepository {
    
    public UserRepository() {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getRandomUser(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.test.Data.Remote.Entity.TempPerson>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getRandomUserFromDatabase(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.test.Data.Remote.Entity.TempPerson>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object insertRandomUserInDatabase(@org.jetbrains.annotations.NotNull
    com.example.test.Data.Remote.Entity.ApiRandomUser user, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}