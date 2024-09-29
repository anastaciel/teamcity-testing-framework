package com.example.teamcity.api;

import com.example.teamcity.api.models.User;
import org.testng.annotations.Test;

public class BuildConfigurationTest extends BaseApiTest{
    @Test
    public void buildConfigurationTest(){
        var user = User.builder()
                .username("admin")
                .password("admin")
                .build();


    }
}
