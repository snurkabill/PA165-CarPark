package cz.muni.fi.pa165.carpark.rest.configuration;

import cz.muni.fi.pa165.carpark.sample.data.configuration.CarParkSampleDataConfiguration;
import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by karelfajkus on 03/12/2016.
 */
@Configuration
@Import(CarParkSampleDataConfiguration.class)
@ComponentScan(value = "cz.muni.fi.pa165.carpark.rest")
public class RestConfiguration extends WebMvcConfigurerAdapter {
}
