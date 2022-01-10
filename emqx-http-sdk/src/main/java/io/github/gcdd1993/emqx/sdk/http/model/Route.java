package io.github.gcdd1993.emqx.sdk.http.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 路由
 *
 * @author gcdd1993
 * @since 2022/1/10
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Route {

    /**
     * MQTT 主题
     */
    private String topic;

    /**
     * 节点名称
     */
    private String node;
}
