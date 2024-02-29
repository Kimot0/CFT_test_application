package com.example.test.UI;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fR\"\u0010\u0005\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/test/UI/MainFragmentViewModel;", "Landroidx/lifecycle/ViewModel;", "personRepository", "Lcom/example/test/Domain/Repo/IUserRepository;", "(Lcom/example/test/Domain/Repo/IUserRepository;)V", "_personInformationStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/test/Utils/Event;", "", "Lcom/example/test/Domain/Entity/RandomUser;", "personInformationStateFlow", "Lkotlinx/coroutines/flow/Flow;", "getPersonInformationStateFlow", "()Lkotlinx/coroutines/flow/Flow;", "getUser", "", "updateUsers", "app_debug"})
public final class MainFragmentViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.test.Domain.Repo.IUserRepository personRepository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.test.Utils.Event<java.util.List<com.example.test.Domain.Entity.RandomUser>>> _personInformationStateFlow = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<com.example.test.Utils.Event<java.util.List<com.example.test.Domain.Entity.RandomUser>>> personInformationStateFlow = null;
    
    public MainFragmentViewModel(@org.jetbrains.annotations.NotNull
    com.example.test.Domain.Repo.IUserRepository personRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.example.test.Utils.Event<java.util.List<com.example.test.Domain.Entity.RandomUser>>> getPersonInformationStateFlow() {
        return null;
    }
    
    public final void getUser() {
    }
    
    public final void updateUsers() {
    }
}