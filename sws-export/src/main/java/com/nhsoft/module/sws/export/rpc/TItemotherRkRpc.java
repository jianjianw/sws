package com.nhsoft.module.sws.export.rpc;

import com.nhsoft.module.sws.export.model.TItemotherCk;
import com.nhsoft.module.sws.export.model.TItemotherRk;

import java.util.Date;
import java.util.List;

public interface TItemotherRkRpc {


    public void batchSaveItemotherRk(List<TItemotherRk> itemotherRks);


    public List<TItemotherRk> findByCenter(String systemBookCode, Date dateFrom, Date dateTo);

}
