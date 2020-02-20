package p;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/tvseries")
public class TvSeriesController {
    @GetMapping
    public Map<String,Object> sayHello(){
        Map<String,Object> result=new HashMap<>();
        result.put("message","Hello world!");
        return  result;
    }

}


/**
访问地址localhost:8080/tvseries
*/
