//package problemSolving;
//
//
//import com.google.gson.Gson;
//import io.swagger.annotations.ApiOperation;
//
//
//import org.json.JSONTokener;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.ParseException;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.*;
//import org.yaml.snakeyaml.Yaml;
//import org.yaml.snakeyaml.constructor.Constructor;
//
//import java.io.*;
//import java.util.stream.Collectors;
//
//
//import org.json.simple.parser.JSONParser;
//@RestController
//@RequestMapping("/.well-known")
//public class WorkingWithFiles {
//
//
//    @GetMapping("/apple-app-site-association")
//    @ApiOperation(value = "get data from DeepLink File", response = JSONObject.class)
//    public JSONObject getDeepLink() {
//
//        JSONParser parser = new JSONParser();
//        try {
////first May
//            JSONObject obj = (JSONObject) parser.parse(new FileReader("C:\\apple-app-site-association.json"));
//       //other one with file under SRC 
//            JSONObject obj = (JSONObject) parser.parse(new FileReader("src/main/resources/apple-app-site-association.json"));
//            
//            // A JSON object. Key value pairs are unordered. JSONObject supports java.util.Map interface.
//          
//// second way            
//            try (InputStream inputStream = getClass().getResourceAsStream("/apple-app-site-association.json");
//                 BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
//                String contents = reader.lines()
//                        .collect(Collectors.joining(System.lineSeparator()));
//                org.json.JSONObject obj2 =new org.json.JSONObject(contents);
//
//
//            }
//     return obj;
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
//        return null;
//    }
//
////    @GetMapping("/apple-app-site-association")
////    @Produces(MediaType.APPLICATION_OCTET_STREAM)
////    public Response getFile() {
////        File file = ... // Initialize this to the File path you want to serve.
////        return Response.ok(file, MediaType.APPLICATION_OCTET_STREAM)
////                .header("Content-Disposition", "attachment; filename=\"" + file.getName() + "\"" ) //optional
////                .build();
////    }
//}
