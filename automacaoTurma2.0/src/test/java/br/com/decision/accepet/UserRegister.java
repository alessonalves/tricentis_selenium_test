package br.com.decision.accepet;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(features = "src/test/resources/features/verificando_cadastro.feature")
public class UserRegister {

}
