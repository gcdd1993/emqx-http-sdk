package io.github.gcdd1993.emqx.sdk.http;

import io.github.gcdd1993.emqx.sdk.http.model.response.EmqxResponse;
import io.github.gcdd1993.emqx.sdk.http.model.response.NodeStats;
import io.github.gcdd1993.emqx.sdk.http.model.response.Stats;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

/**
 * 状态
 *
 * @author gcdd1993
 * @since 2022/1/10
 */
public interface EmqxStatsApi {

    /**
     * 返回集群下所有状态数据
     *
     * @return 状态数据
     */
    @GET("/api/v4/stats")
    Call<EmqxResponse<List<NodeStats>>> stats();

    /**
     * 返回指定节点上的状态数据
     *
     * @param node 节点名称
     * @return 状态数据
     */
    @GET("/api/v4/nodes/{node}/stats")
    Call<EmqxResponse<Stats>> stats(@Path("node") String node);

}
