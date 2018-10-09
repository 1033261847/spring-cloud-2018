package com.zx.spingcloud.cfgbeans;

import com.netflix.loadbalancer.*;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {


    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }


    /**
     * Ribbon : 负载均衡 算法
     *      RoundRobinRule      轮询   ->  默认的
     *      RandomRule          随机
     *      AvailabilityFilteringRule
     *          会先过滤由于多次访问故障而处于短路器跳闸状态的服务,
     *          还有并发连接数量超过阀时的服务,然后对剩余的服务列表内按照 轮询策略进行
     *      WeightedResponseTimeRule
     *          根据平均响应时间计算所有服务的权重,响应时间越快服务权重越大被选中的概率越高,
     *          刚启动时如果统计不足,则使用 RoundRobinRule 策略,
     *          等统计信息足够时,会切换到 WeightedResponseTimeRule
     *      RetryRule
     *          先按照 RoundRobinRule的策略获取服务,如果获取服务失败则在指定的时间内会进行重试,获取可用的服务
     *          某个服务器获取几次失败后,就不会这个服务访问了  . 如 List 中 删除了 本服务
     *     BestAvailableRule
     *          会先过滤由于多次访问故障而处于短路器跳闸状态的服务,然后选择一个并发量小的服务
     *      ZoneAvoidanceRule
     *          默认规则,复合判断server所在区域的性能和server的可用性选择服务器
     *
     * @return
     */
    @Bean
    public IRule myRule(){
        return new RandomRule();
    }


}
