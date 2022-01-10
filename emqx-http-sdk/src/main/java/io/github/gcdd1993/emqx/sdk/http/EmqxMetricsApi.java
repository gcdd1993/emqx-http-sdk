package io.github.gcdd1993.emqx.sdk.http;

import io.github.gcdd1993.emqx.sdk.http.model.request.TopicMetricsRequest;
import io.github.gcdd1993.emqx.sdk.http.model.response.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

/**
 * 统计指标
 *
 * @author gcdd1993
 * @since 2022/1/10
 */
public interface EmqxMetricsApi {

    /**
     * 返回集群下所有统计指标数据
     *
     * @return 统计指标数据
     */
    @GET("/api/v4/metrics")
    Call<EmqxResponse<List<NodeMetrics>>> metrics();

    /**
     * 返回集群下所有统计指标数据
     *
     * @param node 节点名称
     * @return 统计指标数据
     */
    @GET("/api/v4/nodes/{node}/metrics")
    Call<EmqxResponse<Metrics>> nodeMetrics(@Path("node") String node);

    /**
     * 返回集群下所有统计指标数据
     *
     * @return 统计指标数据
     */
    @GET("/api/v4/topic-metrics")
    Call<EmqxResponse<List<TopicMetrics>>> topicMetrics();

    /**
     * 返回指定主题的统计指标数据
     *
     * @param topic 主题名称
     * @return 统计指标数据
     */
    @GET("/api/v4/topic-metrics/{topic}")
    Call<EmqxResponse<Metrics>> topicMetrics(@Path("topic") String topic);

    /**
     * 开启对指定主题的指标统计
     *
     * @param request 主题名称
     * @return {"code":0}
     */
    @POST("/api/v4/topic-metrics")
    Call<EmqxResponse<?>> startTopicMetrics(@Body TopicMetricsRequest request);

    /**
     * 关闭对指定主题的指标统计
     *
     * @param topic 主题名称
     * @return {"code":0}
     */
    @DELETE("/api/v4/topic-metrics/{topic}")
    Call<EmqxResponse<?>> stopTopicMetrics(@Path("topic") String topic);

    /**
     * 关闭所有主题的指标统计
     *
     * @return {"code":0}
     */
    @DELETE("/api/v4/topic-metrics/{topic}")
    Call<EmqxResponse<?>> stopTopicMetrics();


}
