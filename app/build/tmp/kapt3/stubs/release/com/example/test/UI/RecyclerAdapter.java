package com.example.test.UI;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0015B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\u001c\u0010\f\u001a\u00020\u00062\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0005H\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u0014\u0010\u0013\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\u0014R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/test/UI/RecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/test/UI/RecyclerAdapter$RecyclerViewHolder;", "onItemClick", "Lkotlin/Function1;", "", "", "(Lkotlin/jvm/functions/Function1;)V", "dataList", "", "Lcom/example/test/Data/Remote/Entity/TempPerson;", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setUpdatedData", "", "RecyclerViewHolder", "app_release"})
public final class RecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.test.UI.RecyclerAdapter.RecyclerViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> onItemClick = null;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.test.Data.Remote.Entity.TempPerson> dataList;
    
    public RecyclerAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onItemClick) {
        super();
    }
    
    public final void setUpdatedData(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.test.Data.Remote.Entity.TempPerson> dataList) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.test.UI.RecyclerAdapter.RecyclerViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.test.UI.RecyclerAdapter.RecyclerViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/test/UI/RecyclerAdapter$RecyclerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/test/databinding/ItemPersonCardBinding;", "onItemClick", "Lkotlin/Function1;", "", "", "(Lcom/example/test/UI/RecyclerAdapter;Lcom/example/test/databinding/ItemPersonCardBinding;Lkotlin/jvm/functions/Function1;)V", "bind", "data", "Lcom/example/test/Data/Remote/Entity/TempPerson;", "app_release"})
    public final class RecyclerViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.example.test.databinding.ItemPersonCardBinding binding = null;
        @org.jetbrains.annotations.NotNull
        private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> onItemClick = null;
        
        public RecyclerViewHolder(@org.jetbrains.annotations.NotNull
        com.example.test.databinding.ItemPersonCardBinding binding, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onItemClick) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.example.test.Data.Remote.Entity.TempPerson data) {
        }
    }
}