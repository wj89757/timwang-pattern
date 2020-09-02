package com.timwang.pattern.core.strategy;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wangjun
 * @date 2019/6/2
 */
public class RandomAssignStrategy implements AssignStrategy {

    @Override
    public Integer assign(List<ProjectUserScore> userScoreList) {
        List<Integer> userIdList = userScoreList.stream().map(ProjectUserScore::getUserId).collect(Collectors.toList());
        Collections.shuffle(userIdList);
        return userIdList.get(0);
    }
}
