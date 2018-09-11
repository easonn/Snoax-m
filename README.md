# Snoax-m
- SpringBoot 2.0.1.RELEASE
- Spring Cloud Finchley.SR1

Eureka Server : http://localhost:8761/

Ribbon Hystrix stream : http://localhost:8764/hystrix.stream

Feign Hystrix stream : http://localhost:8765/hystrix.stream

Ribbon Hystrix monitor dashboard: http://localhost:8764/hystrix/monitor?stream=http%3A%2F%2Flocalhost%3A8764%2Fhystrix.stream&title=client-ribbon

Feign Hystrix monitor dashboard: http://localhost:8765/hystrix/monitor?stream=http%3A%2F%2Flocalhost%3A8765%2Fhystrix.stream&title=client-feign

Turbine Hystrix monitor dashboard: http://localhost:8765/hystrix/monitor?stream=http%3A%2F%2Flocalhost%3A8769%2Fturbine.stream&title=monitor

Zuul 
http://localhost:5000/v1/hiapi/hi?name=forezp