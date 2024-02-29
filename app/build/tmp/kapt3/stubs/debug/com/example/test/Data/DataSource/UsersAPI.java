package com.example.test.Data.DataSource;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/example/test/Data/DataSource/UsersAPI;", "", "getUsers", "Lretrofit2/Response;", "Lcom/example/test/Data/Remote/Entity/Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract interface UsersAPI {
    @org.jetbrains.annotations.NotNull
    public static final com.example.test.Data.DataSource.UsersAPI.Companion Companion = null;
    
    @retrofit2.http.GET(value = "api/?results=10")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getUsers(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.test.Data.Remote.Entity.Result>> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/test/Data/DataSource/UsersAPI$Companion;", "", "()V", "BASE_URL", "", "CONNECTION_TIMEOUT_IN_SECONDS", "", "provideUsersApi", "Lcom/example/test/Data/DataSource/UsersAPI;", "app_debug"})
    public static final class Companion {
        private static final long CONNECTION_TIMEOUT_IN_SECONDS = 30L;
        @org.jetbrains.annotations.NotNull
        private static final java.lang.String BASE_URL = "https://randomuser.me/";
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.test.Data.DataSource.UsersAPI provideUsersApi() {
            return null;
        }
    }
}