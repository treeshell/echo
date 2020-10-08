package cn.treeshell.echo.controller.admin;

import cn.treeshell.echo.common.ApiResponse;
import cn.treeshell.echo.controller.BaseController;
import cn.treeshell.echo.model.param.LoginParam;
import cn.treeshell.echo.model.param.RegisterParam;
import cn.treeshell.echo.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * User Controller.
 *
 * @author panjing
 */
@ApiOperation("用户相关接口")
@RestController
@RequestMapping("/admin/user")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController extends BaseController {

    private final UserService userService;

    /**
     * 登录
     */
    @ApiOperation("登录")
    @PostMapping("/login")
    public ApiResponse login(@RequestBody @Valid @ApiParam LoginParam loginParam) {
        return this.success(userService.login(loginParam));
    }

    /**
     * 注册
     */
    @ApiOperation("注册")
    @PostMapping("/register")
    public ApiResponse register(@RequestBody @Valid @ApiParam RegisterParam registerParam) {
        userService.register(registerParam);
        return this.success();
    }
}

