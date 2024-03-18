package dev.martintaylor.transfer_service.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbEnhancedClient;
import software.amazon.awssdk.services.s3.S3AsyncClient;

@Configuration
class AwsConfiguration {
    @Bean
    DynamoDbEnhancedClient dynamoDbEnhancedClient() {
        return DynamoDbEnhancedClient.builder().build();
    }

    @Bean
    S3AsyncClient s3AsyncClient() {
        return S3AsyncClient.builder().build();
    }
}