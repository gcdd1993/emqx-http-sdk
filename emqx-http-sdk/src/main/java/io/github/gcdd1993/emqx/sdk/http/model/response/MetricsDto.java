package io.github.gcdd1993.emqx.sdk.http.model.response;

import lombok.Data;

import java.util.LinkedHashMap;

/**
 * 统计指标数据
 *
 * @author gcdd1993
 * @since 2022/1/10
 */
@Data
public class MetricsDto extends LinkedHashMap<String, Long> {
}
