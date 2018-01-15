package com.ultimate.cucumber.stepdefs;

import com.ultimate.UserCardManagementSystemApplicationApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = UserCardManagementSystemApplicationApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
