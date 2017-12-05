package com.rcplatform.livechat;

import com.rcplatform.videochat.model.VirtualUser;

public interface IVirtualUserModule {


    VirtualUser addVirtualUser(VirtualUser virtualUser);



    void updateVirtualUser(VirtualUser virtualUser);



    void deleteVirtualUser(Integer id);
}
