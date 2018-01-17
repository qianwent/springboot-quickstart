# springboot-quickstart
Q: when to use bootstrap.yml or application.yml?
A: https://stackoverflow.com/questions/32997352/what-is-the-diference-between-putting-a-property-on-application-yml-or-bootstrap
    bootstrap.yml is loaded before application.yml
    It is typically used for the following:
    --when using Spring Cloud Config Server, you should specify spring.application.name 
    and spring.cloud.config.server.git.uri inside bootstrap.yml
    --some encryption/decryption information
    
notice: @Controller and @RestController are different
@Controller + @ResponseBody = @RestController