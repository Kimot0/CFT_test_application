package com.example.test.Data.Remote.Entity;

@com.squareup.moshi.JsonClass(generateAdapter = true)
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\tH\u00c6\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001f"}, d2 = {"Lcom/example/test/Data/Remote/Entity/Location;", "", "street", "Lcom/example/test/Data/Remote/Entity/Street;", "city", "", "state", "country", "coordinates", "Lcom/example/test/Data/Remote/Entity/Coordinates;", "(Lcom/example/test/Data/Remote/Entity/Street;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/test/Data/Remote/Entity/Coordinates;)V", "getCity", "()Ljava/lang/String;", "getCoordinates", "()Lcom/example/test/Data/Remote/Entity/Coordinates;", "getCountry", "getState", "getStreet", "()Lcom/example/test/Data/Remote/Entity/Street;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class Location {
    @com.google.gson.annotations.SerializedName(value = "street")
    @com.google.gson.annotations.Expose
    @org.jetbrains.annotations.NotNull
    private final com.example.test.Data.Remote.Entity.Street street = null;
    @com.google.gson.annotations.SerializedName(value = "city")
    @com.google.gson.annotations.Expose
    @org.jetbrains.annotations.NotNull
    private final java.lang.String city = null;
    @com.google.gson.annotations.SerializedName(value = "state")
    @com.google.gson.annotations.Expose
    @org.jetbrains.annotations.NotNull
    private final java.lang.String state = null;
    @com.google.gson.annotations.SerializedName(value = "country")
    @com.google.gson.annotations.Expose
    @org.jetbrains.annotations.NotNull
    private final java.lang.String country = null;
    @com.google.gson.annotations.SerializedName(value = "coordinates")
    @com.google.gson.annotations.Expose
    @org.jetbrains.annotations.NotNull
    private final com.example.test.Data.Remote.Entity.Coordinates coordinates = null;
    
    public Location(@org.jetbrains.annotations.NotNull
    com.example.test.Data.Remote.Entity.Street street, @org.jetbrains.annotations.NotNull
    java.lang.String city, @org.jetbrains.annotations.NotNull
    java.lang.String state, @org.jetbrains.annotations.NotNull
    java.lang.String country, @org.jetbrains.annotations.NotNull
    com.example.test.Data.Remote.Entity.Coordinates coordinates) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.test.Data.Remote.Entity.Street getStreet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.test.Data.Remote.Entity.Coordinates getCoordinates() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.test.Data.Remote.Entity.Street component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.test.Data.Remote.Entity.Coordinates component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.test.Data.Remote.Entity.Location copy(@org.jetbrains.annotations.NotNull
    com.example.test.Data.Remote.Entity.Street street, @org.jetbrains.annotations.NotNull
    java.lang.String city, @org.jetbrains.annotations.NotNull
    java.lang.String state, @org.jetbrains.annotations.NotNull
    java.lang.String country, @org.jetbrains.annotations.NotNull
    com.example.test.Data.Remote.Entity.Coordinates coordinates) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}