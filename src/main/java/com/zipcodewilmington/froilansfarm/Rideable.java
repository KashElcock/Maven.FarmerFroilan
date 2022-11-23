package com.zipcodewilmington.froilansfarm;

public interface Rideable <T extends Rider > {
    public boolean isMounted();
    public void setMounted(boolean isMounted);
}
