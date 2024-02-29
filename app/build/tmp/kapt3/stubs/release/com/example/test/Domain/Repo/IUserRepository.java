package com.example.test.Domain.Repo;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/example/test/Domain/Repo/IUserRepository;", "", "getRandomUser", "", "Lcom/example/test/Data/Remote/Entity/TempPerson;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRandomUserFromDatabase", "insertRandomUserInDatabase", "", "user", "Lcom/example/test/Data/Remote/Entity/ApiRandomUser;", "(Lcom/example/test/Data/Remote/Entity/ApiRandomUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public abstract interface IUserRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getRandomUser(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.test.Data.Remote.Entity.TempPerson>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getRandomUserFromDatabase(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.test.Data.Remote.Entity.TempPerson>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertRandomUserInDatabase(@org.jetbrains.annotations.NotNull
    com.example.test.Data.Remote.Entity.ApiRandomUser user, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}