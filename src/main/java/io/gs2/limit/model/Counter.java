/*
 * Copyright 2016 Game Server Services, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package io.gs2.limit.model;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * カウンター
 *
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Counter implements Serializable {

	/** ユーザID */
	private String userId;

	/** カウンター名 */
	private String counterName;

	/** カウント値 */
	private Integer count;

	/** カウントの最大値 */
	private Integer max;

	/** 次回リセット日時(エポック秒) */
	private Integer nextResetAt;

	/** 最後にカウンターを進めた時間(エポック秒) */
	private Integer countAt;


	/**
	 * ユーザIDを取得
	 *
	 * @return ユーザID
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * ユーザIDを設定
	 *
	 * @param userId ユーザID
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * カウンター名を取得
	 *
	 * @return カウンター名
	 */
	public String getCounterName() {
		return counterName;
	}

	/**
	 * カウンター名を設定
	 *
	 * @param counterName カウンター名
	 */
	public void setCounterName(String counterName) {
		this.counterName = counterName;
	}

	/**
	 * カウント値を取得
	 *
	 * @return カウント値
	 */
	public Integer getCount() {
		return count;
	}

	/**
	 * カウント値を設定
	 *
	 * @param count カウント値
	 */
	public void setCount(Integer count) {
		this.count = count;
	}

	/**
	 * カウントの最大値を取得
	 *
	 * @return カウントの最大値
	 */
	public Integer getMax() {
		return max;
	}

	/**
	 * カウントの最大値を設定
	 *
	 * @param max カウントの最大値
	 */
	public void setMax(Integer max) {
		this.max = max;
	}

	/**
	 * 次回リセット日時(エポック秒)を取得
	 *
	 * @return 次回リセット日時(エポック秒)
	 */
	public Integer getNextResetAt() {
		return nextResetAt;
	}

	/**
	 * 次回リセット日時(エポック秒)を設定
	 *
	 * @param nextResetAt 次回リセット日時(エポック秒)
	 */
	public void setNextResetAt(Integer nextResetAt) {
		this.nextResetAt = nextResetAt;
	}

	/**
	 * 最後にカウンターを進めた時間(エポック秒)を取得
	 *
	 * @return 最後にカウンターを進めた時間(エポック秒)
	 */
	public Integer getCountAt() {
		return countAt;
	}

	/**
	 * 最後にカウンターを進めた時間(エポック秒)を設定
	 *
	 * @param countAt 最後にカウンターを進めた時間(エポック秒)
	 */
	public void setCountAt(Integer countAt) {
		this.countAt = countAt;
	}

}