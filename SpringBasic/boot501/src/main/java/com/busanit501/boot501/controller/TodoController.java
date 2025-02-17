package com.busanit501.boot501.controller;

import com.busanit501.boot501.dto.TodoDTO;
import com.busanit501.boot501.service.TodoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@Log4j2
@RequestMapping("/api/todo")
@RequiredArgsConstructor
public class TodoController {
    private final TodoService todoService;

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Long> register(@RequestBody TodoDTO todoDTO) {
        log.info(todoDTO);
        return Map.of("tno", 12L);
    }

//    @GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
//    public PageResponseDTO<TodoDTO> list(PageRequestDTO pageRequestDTO) {
//        return todoService.list(pageRequestDTO);
//    }

//    @DeleteMapping(value = "/{tno}")
//    public Map<String, String> delete(@PathVariable Long tno) {
//        todoService.remove(tno);
//        return Map.of("result", "success");
//    }
//
//    @PutMapping(value = "/{tno}", consumes = MediaType.APPLICATION_JSON_VALUE)
//    public Map<String, String> modify(@PathVariable("tno") Long tno, @RequestBody TodoDTO todoDTO) {
////잘못된 tno가 발생하지 못하도록
//        todoDTO.setTno(tno);
//        todoService.modify(todoDTO);
//        return Map.of("result", "success");
//    }
}
