정렬 알고리즘
=============

데이터 요소들을 번호 등의 순서대로 열거하는 알고리즘.

탐색이나 병합 알고리즘 등에서 최적화하는데 중요한 알고리즘으로, 데이터의 정규화나 의미있도록 결과물을 생성하는데 유용하게 사용된다.

정렬 알고리즘 분류
==================

정렬 알고리즘은 다음 기준으로 분류가 된다.

1. 데이터 **크기 비교**에 따른 계산 복잡도(최선, 최악, 평균)
2. 데이터 원소 **교환 횟수**에 따른 계산 복잡도
3. **메모리 사용량**

![image](https://user-images.githubusercontent.com/66655578/172139138-6561855d-7eb0-4311-9aa4-bef72817bb1e.png)

위 선택 정렬과 같이 배열 내에서 교환할때만 임시변수로 저장할 추가 공간만 O(1) 필요하다.
그에 반해 병합 정렬은 데이터 원소를 n/2 개씩 나누어가며 정렬하므로 O(n)개 필요하다.

이처럼 O(1) 개 메모리만 필요한 알고리즘을 **제자리(in-place) 알고리즘이라 한다,** O(log(n)) 로 간주

4. 안정성

안정성은 중복된 키 값이 존재할 때 이를 입력 때와 동일한 순서로 정렬시키는 것을 뜻한다.

![220px-Sorting_stability_playing_cards svg](https://user-images.githubusercontent.com/66655578/172140864-6345b175-2733-4771-8603-35d44c9fd821.png)

예시로 위와 같은 플레잉 카드가 있다고 하자.
입력했을 때 5 두 장 중 빨강 하트가 먼저온 후, 검정 스페이드 카드가 후에 왔다.
정상적인 순서는 빨강 하트, 검정 스페이드지만,
비정상적인 순서는 검정 스페이드, 빨강 하트로 오는 것이다.

이처럼 **안정성(Stable)** 이 중요한 이유는 특정한 순서가 아니게 뒤섞이는 문제를 야기할 수 있기 때문이다.

위와 같은 분류로, 정렬 알고리즘에서 중요한 키워드는 **average, worst, best, in-place, stable** 등이 있다.

정렬  표
============

### 

비교 정렬은 Ω (n log n) 보다 좋은 성능을 낼 순 없다.

<table class="wikitable sortable jquery-tablesorter">
<thead><tr>
<th class="headerSort" tabindex="0" role="columnheader button" title="오름차순 정렬">이름</th>
<th class="headerSort" tabindex="0" role="columnheader button" title="오름차순 정렬">최선</th>
<th class="headerSort" tabindex="0" role="columnheader button" title="오름차순 정렬">평균</th>
<th class="headerSort" tabindex="0" role="columnheader button" title="오름차순 정렬">최악</th>
<th class="headerSort" tabindex="0" role="columnheader button" title="오름차순 정렬">메모리</th>
<th class="headerSort" tabindex="0" role="columnheader button" title="오름차순 정렬">안정</th>
<th class="headerSort" tabindex="0" role="columnheader button" title="오름차순 정렬">방식
</th></tr></thead><tbody>
<tr align="center">
<td><a href="/wiki/%ED%80%B5_%EC%A0%95%EB%A0%AC" title="퀵 정렬">퀵 정렬</a>
</td>
<td style="background:#dfd"><span data-sort-value="15&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\log n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mi>log</mi>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\log n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/560dfdce0353a330e03e4b3e0b7ca6e484bb40fb" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:6.535ex; height:2.509ex;" alt="{\displaystyle n\log n}"></span></span><br>variation is <span data-sort-value="15&nbsp;!"><link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml" style="font-style: italic;">n</span></span>
</td>
<td style="background:#dfd"><span data-sort-value="20&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\log n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mi>log</mi>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\log n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/560dfdce0353a330e03e4b3e0b7ca6e484bb40fb" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:6.535ex; height:2.509ex;" alt="{\displaystyle n\log n}"></span></span>
</td>
<td style="background:#fdd"><span data-sort-value="25&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n^{2}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <msup>
          <mi>n</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mn>2</mn>
          </mrow>
        </msup>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n^{2}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/ac9810bbdafe4a6a8061338db0f74e25b7952620" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.338ex; width:2.449ex; height:2.676ex;" alt="n^2"></span></span>
</td>
<td style="background:#ffd"><span data-sort-value="05&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle \log n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>log</mi>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle \log n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/317ab5292da7c7935aec01a570461fe0613b21d5" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:4.754ex; height:2.509ex;" alt="{\displaystyle \log n}"></span> on average, worst case space complexity is <link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml" style="font-style: italic;">n</span>; Sedgewick variation is <span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle \log n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>log</mi>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle \log n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/317ab5292da7c7935aec01a570461fe0613b21d5" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:4.754ex; height:2.509ex;" alt="{\displaystyle \log n}"></span> worst case.</span>
</td>
<td style="background:#ffd">일반적인 제자리 정렬은 안정적이지 못하다. 안정판이 존재한다.
</td>
<td>파티셔닝
</td></tr>
<tr align="center">
<td><a href="/wiki/%ED%95%A9%EB%B3%91_%EC%A0%95%EB%A0%AC" title="합병 정렬">합병 정렬</a>
</td>
<td style="background:#dfd"><span data-sort-value="20&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\log n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mi>log</mi>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\log n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/560dfdce0353a330e03e4b3e0b7ca6e484bb40fb" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:6.535ex; height:2.509ex;" alt="{\displaystyle n\log n}"></span></span>
</td>
<td style="background:#dfd"><span data-sort-value="20&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\log n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mi>log</mi>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\log n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/560dfdce0353a330e03e4b3e0b7ca6e484bb40fb" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:6.535ex; height:2.509ex;" alt="{\displaystyle n\log n}"></span></span>
</td>
<td style="background:#dfd"><span data-sort-value="20&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\log n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mi>log</mi>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\log n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/560dfdce0353a330e03e4b3e0b7ca6e484bb40fb" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:6.535ex; height:2.509ex;" alt="{\displaystyle n\log n}"></span></span>
</td>
<td style="background:#fdd"><span data-sort-value="15&nbsp;!"><link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml" style="font-style: italic;">n</span></span><br>A hybrid <a href="https://en.wikipedia.org/wiki/Block_sort" class="extiw" title="en:Block sort">block merge sort</a> is <i>O</i>(1) mem.
</td>
<td style="background:#dfd">예
</td>
<td>합병
</td></tr>
<tr align="center">
<td nowrap=""><a href="/wiki/%ED%95%A9%EB%B3%91_%EC%A0%95%EB%A0%AC" title="합병 정렬">제자리 합병 정렬</a>
</td>
<td>—
</td>
<td>—
</td>
<td style="background:#ffd"><span data-sort-value="23&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\log ^{2}n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <msup>
          <mi>log</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mn>2</mn>
          </mrow>
        </msup>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\log ^{2}n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/8dcc3d3ab4d647731efd75119a13e8febd1a7e44" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:7.59ex; height:3.009ex;" alt="{\displaystyle n\log ^{2}n}"></span></span><br> 상단 참고. 하이브리드의 경우 <span data-sort-value="23&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\log n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mi>log</mi>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\log n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/560dfdce0353a330e03e4b3e0b7ca6e484bb40fb" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:6.535ex; height:2.509ex;" alt="{\displaystyle n\log n}"></span></span>
</td>
<td style="background:#dfd"><span data-sort-value="00&nbsp;!">1</span>
</td>
<td style="background:#dfd">예
</td>
<td>합병
</td></tr>
<tr align="center">
<td><a href="/wiki/%ED%9E%99_%EC%A0%95%EB%A0%AC" title="힙 정렬">힙 정렬</a>
</td>
<td style="background:#dfd"><span data-sort-value="20&nbsp;!"><link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml" style="font-style: italic;">n</span></span><br>모든 키가 구별되는 경우, <span data-sort-value="20&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\log n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mi>log</mi>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\log n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/560dfdce0353a330e03e4b3e0b7ca6e484bb40fb" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:6.535ex; height:2.509ex;" alt="{\displaystyle n\log n}"></span></span>
</td>
<td style="background:#dfd"><span data-sort-value="20&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\log n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mi>log</mi>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\log n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/560dfdce0353a330e03e4b3e0b7ca6e484bb40fb" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:6.535ex; height:2.509ex;" alt="{\displaystyle n\log n}"></span></span>
</td>
<td style="background:#dfd"><span data-sort-value="20&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\log n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mi>log</mi>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\log n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/560dfdce0353a330e03e4b3e0b7ca6e484bb40fb" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:6.535ex; height:2.509ex;" alt="{\displaystyle n\log n}"></span></span>
</td>
<td style="background:#dfd"><span data-sort-value="00&nbsp;!">1</span>
</td>
<td style="background:#fdd">아니오
</td>
<td>선택
</td></tr>
<tr align="center">
<td><a href="/wiki/%EC%82%BD%EC%9E%85_%EC%A0%95%EB%A0%AC" title="삽입 정렬">삽입 정렬</a>
</td>
<td style="background:#dfd"><span data-sort-value="15&nbsp;!"><link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml" style="font-style: italic;">n</span></span>
</td>
<td style="background:#fdd"><span data-sort-value="25&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n^{2}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <msup>
          <mi>n</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mn>2</mn>
          </mrow>
        </msup>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n^{2}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/ac9810bbdafe4a6a8061338db0f74e25b7952620" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.338ex; width:2.449ex; height:2.676ex;" alt="n^2"></span></span>
</td>
<td style="background:#fdd"><span data-sort-value="25&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n^{2}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <msup>
          <mi>n</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mn>2</mn>
          </mrow>
        </msup>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n^{2}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/ac9810bbdafe4a6a8061338db0f74e25b7952620" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.338ex; width:2.449ex; height:2.676ex;" alt="n^2"></span></span>
</td>
<td style="background:#dfd"><span data-sort-value="00&nbsp;!">1</span>
</td>
<td style="background:#dfd">예
</td>
<td>삽입
</td></tr>
<tr align="center">
<td><a href="/w/index.php?title=%EC%9D%B8%ED%8A%B8%EB%A1%9C%EC%86%8C%ED%8A%B8&amp;action=edit&amp;redlink=1" class="new" title="인트로소트 (없는 문서)">인트로소트</a>
</td>
<td style="background:#dfd"><span data-sort-value="20&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\log n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mi>log</mi>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\log n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/560dfdce0353a330e03e4b3e0b7ca6e484bb40fb" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:6.535ex; height:2.509ex;" alt="{\displaystyle n\log n}"></span></span>
</td>
<td style="background:#dfd"><span data-sort-value="20&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\log n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mi>log</mi>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\log n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/560dfdce0353a330e03e4b3e0b7ca6e484bb40fb" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:6.535ex; height:2.509ex;" alt="{\displaystyle n\log n}"></span></span>
</td>
<td style="background:#dfd"><span data-sort-value="20&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\log n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mi>log</mi>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\log n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/560dfdce0353a330e03e4b3e0b7ca6e484bb40fb" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:6.535ex; height:2.509ex;" alt="{\displaystyle n\log n}"></span></span>
</td>
<td style="background:#ffd"><span data-sort-value="05&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle \log n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>log</mi>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle \log n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/317ab5292da7c7935aec01a570461fe0613b21d5" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:4.754ex; height:2.509ex;" alt="{\displaystyle \log n}"></span></span>
</td>
<td style="background:#fdd">아니오
</td>
<td>파티셔닝, 선택
</td></tr>
<tr align="center">
<td><a href="/wiki/%EC%84%A0%ED%83%9D_%EC%A0%95%EB%A0%AC" title="선택 정렬">선택 정렬</a>
</td>
<td style="background:#fdd"><span data-sort-value="25&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n^{2}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <msup>
          <mi>n</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mn>2</mn>
          </mrow>
        </msup>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n^{2}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/ac9810bbdafe4a6a8061338db0f74e25b7952620" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.338ex; width:2.449ex; height:2.676ex;" alt="n^2"></span></span>
</td>
<td style="background:#fdd"><span data-sort-value="25&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n^{2}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <msup>
          <mi>n</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mn>2</mn>
          </mrow>
        </msup>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n^{2}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/ac9810bbdafe4a6a8061338db0f74e25b7952620" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.338ex; width:2.449ex; height:2.676ex;" alt="n^2"></span></span>
</td>
<td style="background:#fdd"><span data-sort-value="25&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n^{2}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <msup>
          <mi>n</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mn>2</mn>
          </mrow>
        </msup>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n^{2}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/ac9810bbdafe4a6a8061338db0f74e25b7952620" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.338ex; width:2.449ex; height:2.676ex;" alt="n^2"></span></span>
</td>
<td style="background:#dfd"><span data-sort-value="00&nbsp;!">1</span>
</td>
<td style="background:#fdd">아니오
</td>
<td>선택
</td></tr>
<tr align="center">
<td><a href="/w/index.php?title=%ED%83%80%EC%9E%84%EC%86%8C%ED%8A%B8&amp;action=edit&amp;redlink=1" class="new" title="타임소트 (없는 문서)">타임소트</a>
</td>
<td style="background:#dfd"><span data-sort-value="15&nbsp;!"><link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml" style="font-style: italic;">n</span></span>
</td>
<td style="background:#dfd"><span data-sort-value="20&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\log n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mi>log</mi>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\log n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/560dfdce0353a330e03e4b3e0b7ca6e484bb40fb" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:6.535ex; height:2.509ex;" alt="{\displaystyle n\log n}"></span></span>
</td>
<td style="background:#dfd"><span data-sort-value="20&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\log n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mi>log</mi>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\log n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/560dfdce0353a330e03e4b3e0b7ca6e484bb40fb" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:6.535ex; height:2.509ex;" alt="{\displaystyle n\log n}"></span></span>
</td>
<td style="background:#fdd"><span data-sort-value="15&nbsp;!"><link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml" style="font-style: italic;">n</span></span>
</td>
<td style="background:#dfd">예
</td>
<td>삽입, 합병
</td></tr>
<tr align="center">
<td><a href="/w/index.php?title=%ED%81%90%EB%B8%8C%EC%86%8C%ED%8A%B8&amp;action=edit&amp;redlink=1" class="new" title="큐브소트 (없는 문서)">큐브소트</a>
</td>
<td style="background:#dfd"><span data-sort-value="15&nbsp;!"><link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml" style="font-style: italic;">n</span></span>
</td>
<td style="background:#dfd"><span data-sort-value="20&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\log n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mi>log</mi>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\log n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/560dfdce0353a330e03e4b3e0b7ca6e484bb40fb" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:6.535ex; height:2.509ex;" alt="{\displaystyle n\log n}"></span></span>
</td>
<td style="background:#dfd"><span data-sort-value="20&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\log n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mi>log</mi>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\log n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/560dfdce0353a330e03e4b3e0b7ca6e484bb40fb" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:6.535ex; height:2.509ex;" alt="{\displaystyle n\log n}"></span></span>
</td>
<td style="background:#fdd"><span data-sort-value="15&nbsp;!"><link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml" style="font-style: italic;">n</span></span>
</td>
<td style="background:#dfd">예
</td>
<td>삽입
</td></tr>
<tr align="center">
<td><a href="/wiki/%EC%85%B8_%EC%A0%95%EB%A0%AC" title="셸 정렬">셸 정렬</a>
</td>
<td style="background:#dfd"><span data-sort-value="20&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\log n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mi>log</mi>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\log n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/560dfdce0353a330e03e4b3e0b7ca6e484bb40fb" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:6.535ex; height:2.509ex;" alt="{\displaystyle n\log n}"></span></span>
</td>
<td style="background:#ffd"><span data-sort-value="23&nbsp;!">Depends on gap sequence</span>
</td>
<td style="background:#ffd"><span data-sort-value="23&nbsp;!">Depends on gap sequence;<br>best known is <span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n^{1.25}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <msup>
          <mi>n</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mn>1.25</mn>
          </mrow>
        </msup>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n^{1.25}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/dbf64515478331b8b655b5307576afcaeff3b297" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.338ex; width:4.55ex; height:2.676ex;" alt="{\displaystyle n^{1.25}}"></span></span>
</td>
<td style="background:#dfd"><span data-sort-value="00&nbsp;!">1</span>
</td>
<td style="background:#fdd">아니오
</td>
<td>삽입
</td></tr>
<tr align="center">
<td><a href="/wiki/%EA%B1%B0%ED%92%88_%EC%A0%95%EB%A0%AC" title="거품 정렬">거품 정렬</a>
</td>
<td style="background:#dfd"><span data-sort-value="15&nbsp;!"><link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml" style="font-style: italic;">n</span></span>
</td>
<td style="background:#fdd"><span data-sort-value="25&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n^{2}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <msup>
          <mi>n</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mn>2</mn>
          </mrow>
        </msup>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n^{2}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/ac9810bbdafe4a6a8061338db0f74e25b7952620" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.338ex; width:2.449ex; height:2.676ex;" alt="n^2"></span></span>
</td>
<td style="background:#fdd"><span data-sort-value="25&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n^{2}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <msup>
          <mi>n</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mn>2</mn>
          </mrow>
        </msup>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n^{2}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/ac9810bbdafe4a6a8061338db0f74e25b7952620" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.338ex; width:2.449ex; height:2.676ex;" alt="n^2"></span></span>
</td>
<td style="background:#dfd"><span data-sort-value="00&nbsp;!">1</span>
</td>
<td style="background:#dfd">예
</td>
<td>교환
</td></tr>
<tr align="center">
<td><a href="/w/index.php?title=%EC%9D%B4%EC%A7%84_%ED%8A%B8%EB%A6%AC_%EC%A0%95%EB%A0%AC&amp;action=edit&amp;redlink=1" class="new" title="이진 트리 정렬 (없는 문서)">이진 트리 정렬</a>
</td>
<td style="background:#dfd"><span data-sort-value="20&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\log n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mi>log</mi>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\log n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/560dfdce0353a330e03e4b3e0b7ca6e484bb40fb" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:6.535ex; height:2.509ex;" alt="{\displaystyle n\log n}"></span></span>
</td>
<td style="background:#dfd"><span data-sort-value="20&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\log n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mi>log</mi>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\log n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/560dfdce0353a330e03e4b3e0b7ca6e484bb40fb" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:6.535ex; height:2.509ex;" alt="{\displaystyle n\log n}"></span></span>
</td>
<td style="background:#dfd"><span data-sort-value="20&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\log n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mi>log</mi>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\log n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/560dfdce0353a330e03e4b3e0b7ca6e484bb40fb" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:6.535ex; height:2.509ex;" alt="{\displaystyle n\log n}"></span><wbr>(balanced)</span>
</td>
<td style="background:#fdd"><span data-sort-value="15&nbsp;!"><link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml" style="font-style: italic;">n</span></span>
</td>
<td style="background:#dfd">예
</td>
<td>삽입
</td></tr>
<tr align="center">
<td><a href="/w/index.php?title=%EC%82%AC%EC%9D%B4%ED%81%B4_%EC%A0%95%EB%A0%AC&amp;action=edit&amp;redlink=1" class="new" title="사이클 정렬 (없는 문서)">사이클 정렬</a>
</td>
<td style="background:#fdd"><span data-sort-value="25&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n^{2}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <msup>
          <mi>n</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mn>2</mn>
          </mrow>
        </msup>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n^{2}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/ac9810bbdafe4a6a8061338db0f74e25b7952620" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.338ex; width:2.449ex; height:2.676ex;" alt="n^2"></span></span>
</td>
<td style="background:#fdd"><span data-sort-value="25&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n^{2}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <msup>
          <mi>n</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mn>2</mn>
          </mrow>
        </msup>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n^{2}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/ac9810bbdafe4a6a8061338db0f74e25b7952620" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.338ex; width:2.449ex; height:2.676ex;" alt="n^2"></span></span>
</td>
<td style="background:#fdd"><span data-sort-value="25&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n^{2}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <msup>
          <mi>n</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mn>2</mn>
          </mrow>
        </msup>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n^{2}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/ac9810bbdafe4a6a8061338db0f74e25b7952620" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.338ex; width:2.449ex; height:2.676ex;" alt="n^2"></span></span>
</td>
<td style="background:#dfd"><span data-sort-value="00&nbsp;!">1</span>
</td>
<td style="background:#fdd">아니오
</td>
<td>삽입
</td></tr>
<tr align="center">
<td><a href="/wiki/%EB%9D%BC%EC%9D%B4%EB%B8%8C%EB%9F%AC%EB%A6%AC_%EC%86%8C%ED%8A%B8" class="mw-redirect" title="라이브러리 소트">라이브러리 소트</a>
</td>
<td style="background:#dfd"><span data-sort-value="15&nbsp;!"><link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml" style="font-style: italic;">n</span></span>
</td>
<td style="background:#dfd"><span data-sort-value="20&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\log n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mi>log</mi>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\log n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/560dfdce0353a330e03e4b3e0b7ca6e484bb40fb" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:6.535ex; height:2.509ex;" alt="{\displaystyle n\log n}"></span></span>
</td>
<td style="background:#fdd"><span data-sort-value="25&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n^{2}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <msup>
          <mi>n</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mn>2</mn>
          </mrow>
        </msup>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n^{2}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/ac9810bbdafe4a6a8061338db0f74e25b7952620" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.338ex; width:2.449ex; height:2.676ex;" alt="n^2"></span></span>
</td>
<td style="background:#fdd"><span data-sort-value="15&nbsp;!"><link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml" style="font-style: italic;">n</span></span>
</td>
<td style="background:#dfd">예
</td>
<td>삽입
</td></tr>
<tr align="center">
<td><a href="/w/index.php?title=%ED%8E%98%EC%9D%B4%EC%85%98%EC%8A%A4_%EC%86%8C%ED%8C%85&amp;action=edit&amp;redlink=1" class="new" title="페이션스 소팅 (없는 문서)">페이션스 소팅</a>
</td>
<td style="background:#dfd"><span data-sort-value="15&nbsp;!"><link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml" style="font-style: italic;">n</span></span>
</td>
<td>—
</td>
<td style="background:#dfd"><span data-sort-value="20&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\log n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mi>log</mi>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\log n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/560dfdce0353a330e03e4b3e0b7ca6e484bb40fb" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:6.535ex; height:2.509ex;" alt="{\displaystyle n\log n}"></span></span>
</td>
<td style="background:#fdd"><span data-sort-value="15&nbsp;!"><link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml" style="font-style: italic;">n</span></span>
</td>
<td style="background:#fdd">아니오
</td>
<td>삽입, 선택
</td></tr>
<tr align="center">
<td><a href="/w/index.php?title=%EC%8A%A4%EB%AC%B4%EC%8A%A4%EC%86%8C%ED%8A%B8&amp;action=edit&amp;redlink=1" class="new" title="스무스소트 (없는 문서)">스무스소트</a>
</td>
<td style="background:#dfd"><span data-sort-value="15&nbsp;!"><link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml" style="font-style: italic;">n</span></span>
</td>
<td style="background:#dfd"><span data-sort-value="20&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\log n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mi>log</mi>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\log n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/560dfdce0353a330e03e4b3e0b7ca6e484bb40fb" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:6.535ex; height:2.509ex;" alt="{\displaystyle n\log n}"></span></span>
</td>
<td style="background:#dfd"><span data-sort-value="20&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\log n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mi>log</mi>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\log n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/560dfdce0353a330e03e4b3e0b7ca6e484bb40fb" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:6.535ex; height:2.509ex;" alt="{\displaystyle n\log n}"></span></span>
</td>
<td style="background:#dfd"><span data-sort-value="00&nbsp;!">1</span>
</td>
<td style="background:#fdd">아니오
</td>
<td>선택
</td></tr>
<tr align="center">
<td><a href="/w/index.php?title=%EC%8A%A4%ED%8A%B8%EB%9E%9C%EB%93%9C_%EC%86%8C%ED%8A%B8&amp;action=edit&amp;redlink=1" class="new" title="스트랜드 소트 (없는 문서)">스트랜드 소트</a>
</td>
<td style="background:#dfd"><span data-sort-value="15&nbsp;!"><link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml" style="font-style: italic;">n</span></span>
</td>
<td style="background:#fdd"><span data-sort-value="25&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n^{2}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <msup>
          <mi>n</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mn>2</mn>
          </mrow>
        </msup>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n^{2}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/ac9810bbdafe4a6a8061338db0f74e25b7952620" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.338ex; width:2.449ex; height:2.676ex;" alt="n^2"></span></span>
</td>
<td style="background:#fdd"><span data-sort-value="25&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n^{2}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <msup>
          <mi>n</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mn>2</mn>
          </mrow>
        </msup>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n^{2}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/ac9810bbdafe4a6a8061338db0f74e25b7952620" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.338ex; width:2.449ex; height:2.676ex;" alt="n^2"></span></span>
</td>
<td style="background:#fdd"><span data-sort-value="15&nbsp;!"><link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml" style="font-style: italic;">n</span></span>
</td>
<td style="background:#dfd">예
</td>
<td>선택
</td></tr>
<tr align="center">
<td><a href="/w/index.php?title=%ED%86%A0%EB%84%88%EB%A8%BC%ED%8A%B8_%EC%A0%95%EB%A0%AC&amp;action=edit&amp;redlink=1" class="new" title="토너먼트 정렬 (없는 문서)">토너먼트 정렬</a>
</td>
<td style="background:#dfd"><span data-sort-value="20&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\log n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mi>log</mi>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\log n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/560dfdce0353a330e03e4b3e0b7ca6e484bb40fb" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:6.535ex; height:2.509ex;" alt="{\displaystyle n\log n}"></span></span>
</td>
<td style="background:#dfd"><span data-sort-value="20&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\log n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mi>log</mi>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\log n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/560dfdce0353a330e03e4b3e0b7ca6e484bb40fb" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:6.535ex; height:2.509ex;" alt="{\displaystyle n\log n}"></span></span>
</td>
<td style="background:#dfd"><span data-sort-value="20&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\log n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mi>log</mi>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\log n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/560dfdce0353a330e03e4b3e0b7ca6e484bb40fb" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:6.535ex; height:2.509ex;" alt="{\displaystyle n\log n}"></span></span>
</td>
<td style="background:#fdd"><span data-sort-value="15&nbsp;!"><link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml" style="font-style: italic;">n</span><sup id="cite_ref-6" class="reference"><a href="#cite_note-6">[6]</a></sup></span>
</td>
<td style="background:#fdd">아니오
</td>
<td>선택
</td></tr>
<tr align="center">
<td><a href="/wiki/%EC%B9%B5%ED%85%8C%EC%9D%BC_%EC%A0%95%EB%A0%AC" title="칵테일 정렬">칵테일 정렬</a>
</td>
<td style="background:#dfd"><span data-sort-value="15&nbsp;!"><link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml" style="font-style: italic;">n</span></span>
</td>
<td style="background:#fdd"><span data-sort-value="25&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n^{2}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <msup>
          <mi>n</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mn>2</mn>
          </mrow>
        </msup>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n^{2}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/ac9810bbdafe4a6a8061338db0f74e25b7952620" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.338ex; width:2.449ex; height:2.676ex;" alt="n^2"></span></span>
</td>
<td style="background:#fdd"><span data-sort-value="25&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n^{2}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <msup>
          <mi>n</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mn>2</mn>
          </mrow>
        </msup>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n^{2}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/ac9810bbdafe4a6a8061338db0f74e25b7952620" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.338ex; width:2.449ex; height:2.676ex;" alt="n^2"></span></span>
</td>
<td style="background:#dfd"><span data-sort-value="00&nbsp;!">1</span>
</td>
<td style="background:#dfd">예
</td>
<td>교환
</td></tr>
<tr align="center">
<td><a href="/wiki/%EB%B9%97%EC%A7%88_%EC%A0%95%EB%A0%AC" title="빗질 정렬">빗질 정렬</a>
</td>
<td style="background:#dfd"><span data-sort-value="20&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\log n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mi>log</mi>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\log n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/560dfdce0353a330e03e4b3e0b7ca6e484bb40fb" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:6.535ex; height:2.509ex;" alt="{\displaystyle n\log n}"></span></span>
</td>
<td style="background:#fdd"><span data-sort-value="25&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n^{2}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <msup>
          <mi>n</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mn>2</mn>
          </mrow>
        </msup>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n^{2}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/ac9810bbdafe4a6a8061338db0f74e25b7952620" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.338ex; width:2.449ex; height:2.676ex;" alt="n^2"></span></span>
</td>
<td style="background:#fdd"><span data-sort-value="25&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n^{2}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <msup>
          <mi>n</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mn>2</mn>
          </mrow>
        </msup>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n^{2}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/ac9810bbdafe4a6a8061338db0f74e25b7952620" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.338ex; width:2.449ex; height:2.676ex;" alt="n^2"></span></span>
</td>
<td style="background:#dfd"><span data-sort-value="00&nbsp;!">1</span>
</td>
<td style="background:#fdd">아니오
</td>
<td>교환
</td></tr>
<tr align="center">
<td><a href="/w/index.php?title=%EA%B7%B8%EB%86%88_%EC%A0%95%EB%A0%AC&amp;action=edit&amp;redlink=1" class="new" title="그놈 정렬 (없는 문서)">그놈 정렬</a>
</td>
<td style="background:#dfd"><span data-sort-value="15&nbsp;!"><link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml" style="font-style: italic;">n</span></span>
</td>
<td style="background:#fdd"><span data-sort-value="25&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n^{2}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <msup>
          <mi>n</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mn>2</mn>
          </mrow>
        </msup>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n^{2}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/ac9810bbdafe4a6a8061338db0f74e25b7952620" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.338ex; width:2.449ex; height:2.676ex;" alt="n^2"></span></span>
</td>
<td style="background:#fdd"><span data-sort-value="25&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n^{2}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <msup>
          <mi>n</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mn>2</mn>
          </mrow>
        </msup>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n^{2}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/ac9810bbdafe4a6a8061338db0f74e25b7952620" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.338ex; width:2.449ex; height:2.676ex;" alt="n^2"></span></span>
</td>
<td style="background:#dfd"><span data-sort-value="00&nbsp;!">1</span>
</td>
<td style="background:#dfd">예
</td>
<td>교환
</td></tr>
<tr align="center">
<td nowrap="">언셔플 소트<sup id="cite_ref-7" class="reference"><a href="#cite_note-7">[7]</a></sup>
</td>
<td style="background:#dfd"><span data-sort-value="15&nbsp;!"><link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml" style="font-style: italic;">n</span></span>
</td>
<td style="background:#fdd"><span data-sort-value="25&nbsp;!"><link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml" style="font-style: italic;">kn</span></span>
</td>
<td style="background:#fdd"><span data-sort-value="25&nbsp;!"><link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml" style="font-style: italic;">kn</span></span>
</td>
<td style="background:#ffd"><span data-sort-value="00&nbsp;!">In-place for linked lists. <span style="font-family: monospace, monospace;">n * <a href="https://en.wikipedia.org/wiki/sizeof" class="extiw" title="en:sizeof">en:sizeof</a>(link)</span> for array. <span style="font-family: monospace, monospace;">n+1</span> for array?</span>
</td>
<td style="background:#fdd">아니오
</td>
<td>분산, 합병
</td></tr>
<tr align="center">
<td nowrap="">Franceschini's method<sup id="cite_ref-8" class="reference"><a href="#cite_note-8">[8]</a></sup>
</td>
<td>—
</td>
<td style="background:#dfd"><span data-sort-value="20&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\log n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mi>log</mi>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\log n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/560dfdce0353a330e03e4b3e0b7ca6e484bb40fb" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:6.535ex; height:2.509ex;" alt="{\displaystyle n\log n}"></span></span>
</td>
<td style="background:#dfd"><span data-sort-value="20&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\log n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mi>log</mi>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\log n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/560dfdce0353a330e03e4b3e0b7ca6e484bb40fb" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:6.535ex; height:2.509ex;" alt="{\displaystyle n\log n}"></span></span>
</td>
<td style="background:#dfd"><span data-sort-value="00&nbsp;!">1</span>
</td>
<td style="background:#dfd">예
</td>
<td style="background: #ececec; color: grey; vertical-align: middle; text-align: center;" class="unknown table-unknown">?
</td></tr>
<tr align="center">
<td><a href="/w/index.php?title=%EB%B8%94%EB%A1%9D_%EC%A0%95%EB%A0%AC&amp;action=edit&amp;redlink=1" class="new" title="블록 정렬 (없는 문서)">블록 정렬</a>
</td>
<td style="background:#dfd"><span data-sort-value="15&nbsp;!"><link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml" style="font-style: italic;">n</span></span>
</td>
<td style="background:#dfd"><span data-sort-value="20&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\log n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mi>log</mi>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\log n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/560dfdce0353a330e03e4b3e0b7ca6e484bb40fb" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:6.535ex; height:2.509ex;" alt="{\displaystyle n\log n}"></span></span>
</td>
<td style="background:#dfd"><span data-sort-value="20&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\log n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mi>log</mi>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\log n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/560dfdce0353a330e03e4b3e0b7ca6e484bb40fb" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:6.535ex; height:2.509ex;" alt="{\displaystyle n\log n}"></span></span>
</td>
<td style="background:#dfd"><span data-sort-value="00&nbsp;!">1</span>
</td>
<td style="background:#dfd">예
</td>
<td>삽입, 합병
</td></tr>
<tr align="center">
<td><a href="/w/index.php?title=%ED%99%80%EC%A7%9D_%EC%A0%95%EB%A0%AC&amp;action=edit&amp;redlink=1" class="new" title="홀짝 정렬 (없는 문서)">홀짝 정렬</a>
</td>
<td style="background:#dfd"><span data-sort-value="15&nbsp;!"><link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml" style="font-style: italic;">n</span></span>
</td>
<td style="background:#fdd"><span data-sort-value="25&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n^{2}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <msup>
          <mi>n</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mn>2</mn>
          </mrow>
        </msup>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n^{2}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/ac9810bbdafe4a6a8061338db0f74e25b7952620" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.338ex; width:2.449ex; height:2.676ex;" alt="n^2"></span></span>
</td>
<td style="background:#fdd"><span data-sort-value="25&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n^{2}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <msup>
          <mi>n</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mn>2</mn>
          </mrow>
        </msup>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n^{2}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/ac9810bbdafe4a6a8061338db0f74e25b7952620" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.338ex; width:2.449ex; height:2.676ex;" alt="n^2"></span></span>
</td>
<td style="background:#dfd"><span data-sort-value="00&nbsp;!">1</span>
</td>
<td style="background:#dfd">예
</td>
<td>교환
</td></tr>
<tr align="center">
<td><a href="/w/index.php?title=%EC%BB%A4%EB%B8%8C_%EC%A0%95%EB%A0%AC&amp;action=edit&amp;redlink=1" class="new" title="커브 정렬 (없는 문서)">커브 정렬</a>
</td>
<td style="background:#dfd"><span data-sort-value="15&nbsp;!"><link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml" style="font-style: italic;">n</span></span>
</td>
<td style="background:#fdd"><span data-sort-value="25&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n^{2}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <msup>
          <mi>n</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mn>2</mn>
          </mrow>
        </msup>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n^{2}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/ac9810bbdafe4a6a8061338db0f74e25b7952620" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.338ex; width:2.449ex; height:2.676ex;" alt="n^2"></span></span>
</td>
<td style="background:#fdd"><span data-sort-value="25&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n^{2}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <msup>
          <mi>n</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mn>2</mn>
          </mrow>
        </msup>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n^{2}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/ac9810bbdafe4a6a8061338db0f74e25b7952620" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.338ex; width:2.449ex; height:2.676ex;" alt="n^2"></span></span>
</td>
<td style="background:#fdd"><span data-sort-value="00&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle \Omega (1)\cap {\mathcal {O}}(n)}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi mathvariant="normal">Ω<!-- Ω --></mi>
        <mo stretchy="false">(</mo>
        <mn>1</mn>
        <mo stretchy="false">)</mo>
        <mo>∩<!-- ∩ --></mo>
        <mrow class="MJX-TeXAtom-ORD">
          <mrow class="MJX-TeXAtom-ORD">
            <mi class="MJX-tex-caligraphic" mathvariant="script">O</mi>
          </mrow>
        </mrow>
        <mo stretchy="false">(</mo>
        <mi>n</mi>
        <mo stretchy="false">)</mo>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle \Omega (1)\cap {\mathcal {O}}(n)}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/3befef5d2d2b9f1998a39f775b841ec62e3e68d4" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.838ex; width:12.286ex; height:2.843ex;" alt="{\displaystyle \Omega (1)\cap {\mathcal {O}}(n)}"></span></span>
</td>
<td style="background:#dfd">예
</td>
<td>삽입, 계수
</td></tr></tbody><tfoot></tfoot></table>

### 비교 아닌 정렬 알고리즘

<table class="wikitable sortable jquery-tablesorter">
<thead><tr>
<th class="headerSort" tabindex="0" role="columnheader button" title="오름차순 정렬">이름</th>
<th class="headerSort" tabindex="0" role="columnheader button" title="오름차순 정렬">최선</th>
<th class="headerSort" tabindex="0" role="columnheader button" title="오름차순 정렬">평균</th>
<th class="headerSort" tabindex="0" role="columnheader button" title="오름차순 정렬">최악</th>
<th class="headerSort" tabindex="0" role="columnheader button" title="오름차순 정렬">메모리</th>
<th class="headerSort" tabindex="0" role="columnheader button" title="오름차순 정렬">안정</th>
<th class="headerSort" tabindex="0" role="columnheader button" title="오름차순 정렬"><link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml"><i>n</i> ≪ 2<sup><i>k</i></sup></span>
</th></tr></thead><tbody>
<tr align="center">
<td><a href="/w/index.php?title=%EB%B9%84%EB%91%98%EA%B8%B0%EC%A7%91_%EC%A0%95%EB%A0%AC&amp;action=edit&amp;redlink=1" class="new" title="비둘기집 정렬 (없는 문서)">비둘기집 정렬</a>
</td>
<td>—
</td>
<td style="background:#dfd"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n+2^{k}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mo>+</mo>
        <msup>
          <mn>2</mn>
          <mrow class="MJX-TeXAtom-ORD">
            <mi>k</mi>
          </mrow>
        </msup>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n+2^{k}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/ec2a3b940ba9a9ad932d9ae1c0206ae0ceab86dc" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.505ex; width:6.486ex; height:2.843ex;" alt="{\displaystyle n+2^{k}}"></span>
</td>
<td style="background:#dfd"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n+2^{k}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mo>+</mo>
        <msup>
          <mn>2</mn>
          <mrow class="MJX-TeXAtom-ORD">
            <mi>k</mi>
          </mrow>
        </msup>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n+2^{k}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/ec2a3b940ba9a9ad932d9ae1c0206ae0ceab86dc" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.505ex; width:6.486ex; height:2.843ex;" alt="{\displaystyle n+2^{k}}"></span>
</td>
<td><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle 2^{k}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <msup>
          <mn>2</mn>
          <mrow class="MJX-TeXAtom-ORD">
            <mi>k</mi>
          </mrow>
        </msup>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle 2^{k}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/2d82641ae2702b0db07dd11830af27b9ee0cd196" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.338ex; width:2.251ex; height:2.676ex;" alt="2^{k}"></span>
</td>
<td style="background: #90ff90; color: black; vertical-align: middle; text-align: center;" class="table-yes">예
</td>
<td style="background: #90ff90; color: black; vertical-align: middle; text-align: center;" class="table-yes">예
</td></tr>
<tr align="center">
<td><a href="/wiki/%EB%B2%84%ED%82%B7_%EC%A0%95%EB%A0%AC" title="버킷 정렬">버킷 정렬</a> (uniform keys)
</td>
<td>—
</td>
<td style="background:#dfd"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n+k}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mo>+</mo>
        <mi>k</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n+k}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/94ccf8f07ceddde4d06fab179c36ccd2c264c243" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.505ex; width:5.446ex; height:2.343ex;" alt="n+k"></span>
</td>
<td style="background:#fdd"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n^{2}\cdot k}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <msup>
          <mi>n</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mn>2</mn>
          </mrow>
        </msup>
        <mo>⋅<!-- ⋅ --></mo>
        <mi>k</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n^{2}\cdot k}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/1a8e12aa598dc98f2fa9f5dcbb0f473710d35e41" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.338ex; width:5.339ex; height:2.676ex;" alt="{\displaystyle n^{2}\cdot k}"></span>
</td>
<td><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\cdot k}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mo>⋅<!-- ⋅ --></mo>
        <mi>k</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\cdot k}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/c6fba7993eed5a22ecab0c0008a16e2f81f260af" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.338ex; width:4.285ex; height:2.176ex;" alt="{\displaystyle n\cdot k}"></span>
</td>
<td style="background: #90ff90; color: black; vertical-align: middle; text-align: center;" class="table-yes">예
</td>
<td style="background:#ff9090; color:black; vertical-align: middle; text-align: center;" class="table-no">아니요
</td></tr>
<tr align="center">
<td><a href="/wiki/%EB%B2%84%ED%82%B7_%EC%A0%95%EB%A0%AC" title="버킷 정렬">버킷 정렬</a> (integer keys)
</td>
<td>—
</td>
<td style="background:#dfd"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n+r}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mo>+</mo>
        <mi>r</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n+r}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/d6a5e6925440ca0c67b8608c15b3fc842d6b3199" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.505ex; width:5.284ex; height:2.176ex;" alt="n+r"></span>
</td>
<td style="background:#dfd"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n+r}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mo>+</mo>
        <mi>r</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n+r}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/d6a5e6925440ca0c67b8608c15b3fc842d6b3199" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.505ex; width:5.284ex; height:2.176ex;" alt="n+r"></span>
</td>
<td><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n+r}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mo>+</mo>
        <mi>r</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n+r}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/d6a5e6925440ca0c67b8608c15b3fc842d6b3199" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.505ex; width:5.284ex; height:2.176ex;" alt="n+r"></span>
</td>
<td style="background: #90ff90; color: black; vertical-align: middle; text-align: center;" class="table-yes">예
</td>
<td style="background: #90ff90; color: black; vertical-align: middle; text-align: center;" class="table-yes">예
</td></tr>
<tr align="center">
<td><a href="/w/index.php?title=%EA%B3%84%EC%88%98_%EC%A0%95%EB%A0%AC&amp;action=edit&amp;redlink=1" class="new" title="계수 정렬 (없는 문서)">계수 정렬</a>
</td>
<td>—
</td>
<td style="background:#dfd"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n+r}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mo>+</mo>
        <mi>r</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n+r}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/d6a5e6925440ca0c67b8608c15b3fc842d6b3199" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.505ex; width:5.284ex; height:2.176ex;" alt="n+r"></span>
</td>
<td style="background:#dfd"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n+r}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mo>+</mo>
        <mi>r</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n+r}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/d6a5e6925440ca0c67b8608c15b3fc842d6b3199" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.505ex; width:5.284ex; height:2.176ex;" alt="n+r"></span>
</td>
<td><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n+r}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mo>+</mo>
        <mi>r</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n+r}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/d6a5e6925440ca0c67b8608c15b3fc842d6b3199" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.505ex; width:5.284ex; height:2.176ex;" alt="n+r"></span>
</td>
<td style="background: #90ff90; color: black; vertical-align: middle; text-align: center;" class="table-yes">예
</td>
<td style="background: #90ff90; color: black; vertical-align: middle; text-align: center;" class="table-yes">예
</td></tr>
<tr align="center">
<td><a href="/wiki/%EA%B8%B0%EC%88%98_%EC%A0%95%EB%A0%AC" title="기수 정렬">LSD 기수 정렬</a>
</td>
<td>—
</td>
<td style="background:#dfd"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\cdot {\frac {k}{d}}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mo>⋅<!-- ⋅ --></mo>
        <mrow class="MJX-TeXAtom-ORD">
          <mfrac>
            <mi>k</mi>
            <mi>d</mi>
          </mfrac>
        </mrow>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\cdot {\frac {k}{d}}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/53166c305a8b1af047f2e4c916c4fd8a304d40d0" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -2.005ex; width:5.126ex; height:5.509ex;" alt="{\displaystyle n\cdot {\frac {k}{d}}}"></span>
</td>
<td style="background:#dfd"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\cdot {\frac {k}{d}}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mo>⋅<!-- ⋅ --></mo>
        <mrow class="MJX-TeXAtom-ORD">
          <mfrac>
            <mi>k</mi>
            <mi>d</mi>
          </mfrac>
        </mrow>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\cdot {\frac {k}{d}}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/53166c305a8b1af047f2e4c916c4fd8a304d40d0" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -2.005ex; width:5.126ex; height:5.509ex;" alt="{\displaystyle n\cdot {\frac {k}{d}}}"></span>
</td>
<td><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n+2^{d}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mo>+</mo>
        <msup>
          <mn>2</mn>
          <mrow class="MJX-TeXAtom-ORD">
            <mi>d</mi>
          </mrow>
        </msup>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n+2^{d}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/9b4a94f070d68b2a9f060bc5fd2baab07f1f1a94" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.505ex; width:6.49ex; height:2.843ex;" alt="{\displaystyle n+2^{d}}"></span>
</td>
<td style="background: #90ff90; color: black; vertical-align: middle; text-align: center;" class="table-yes">예
</td>
<td style="background:#ff9090; color:black; vertical-align: middle; text-align: center;" class="table-no">아니요
</td></tr>
<tr align="center">
<td><a href="/wiki/%EA%B8%B0%EC%88%98_%EC%A0%95%EB%A0%AC" title="기수 정렬">MSD 기수 정렬</a>
</td>
<td>—
</td>
<td style="background:#dfd"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\cdot {\frac {k}{d}}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mo>⋅<!-- ⋅ --></mo>
        <mrow class="MJX-TeXAtom-ORD">
          <mfrac>
            <mi>k</mi>
            <mi>d</mi>
          </mfrac>
        </mrow>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\cdot {\frac {k}{d}}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/53166c305a8b1af047f2e4c916c4fd8a304d40d0" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -2.005ex; width:5.126ex; height:5.509ex;" alt="{\displaystyle n\cdot {\frac {k}{d}}}"></span>
</td>
<td style="background:#dfd"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\cdot {\frac {k}{d}}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mo>⋅<!-- ⋅ --></mo>
        <mrow class="MJX-TeXAtom-ORD">
          <mfrac>
            <mi>k</mi>
            <mi>d</mi>
          </mfrac>
        </mrow>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\cdot {\frac {k}{d}}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/53166c305a8b1af047f2e4c916c4fd8a304d40d0" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -2.005ex; width:5.126ex; height:5.509ex;" alt="{\displaystyle n\cdot {\frac {k}{d}}}"></span>
</td>
<td><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n+2^{d}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mo>+</mo>
        <msup>
          <mn>2</mn>
          <mrow class="MJX-TeXAtom-ORD">
            <mi>d</mi>
          </mrow>
        </msup>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n+2^{d}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/9b4a94f070d68b2a9f060bc5fd2baab07f1f1a94" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.505ex; width:6.49ex; height:2.843ex;" alt="{\displaystyle n+2^{d}}"></span>
</td>
<td style="background: #90ff90; color: black; vertical-align: middle; text-align: center;" class="table-yes">예
</td>
<td style="background:#ff9090; color:black; vertical-align: middle; text-align: center;" class="table-no">아니요
</td></tr>
<tr align="center">
<td><a href="/wiki/%EA%B8%B0%EC%88%98_%EC%A0%95%EB%A0%AC" title="기수 정렬">MSD 기수 정렬</a> (제자리)
</td>
<td>—
</td>
<td style="background:#dfd"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\cdot {\frac {k}{d}}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mo>⋅<!-- ⋅ --></mo>
        <mrow class="MJX-TeXAtom-ORD">
          <mfrac>
            <mi>k</mi>
            <mi>d</mi>
          </mfrac>
        </mrow>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\cdot {\frac {k}{d}}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/53166c305a8b1af047f2e4c916c4fd8a304d40d0" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -2.005ex; width:5.126ex; height:5.509ex;" alt="{\displaystyle n\cdot {\frac {k}{d}}}"></span>
</td>
<td style="background:#dfd"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\cdot {\frac {k}{d}}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mo>⋅<!-- ⋅ --></mo>
        <mrow class="MJX-TeXAtom-ORD">
          <mfrac>
            <mi>k</mi>
            <mi>d</mi>
          </mfrac>
        </mrow>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\cdot {\frac {k}{d}}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/53166c305a8b1af047f2e4c916c4fd8a304d40d0" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -2.005ex; width:5.126ex; height:5.509ex;" alt="{\displaystyle n\cdot {\frac {k}{d}}}"></span>
</td>
<td><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle 2^{d}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <msup>
          <mn>2</mn>
          <mrow class="MJX-TeXAtom-ORD">
            <mi>d</mi>
          </mrow>
        </msup>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle 2^{d}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/e78df590f3fc81f0201082eaaa6844c145c8bdf3" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.338ex; width:2.254ex; height:2.676ex;" alt="{\displaystyle 2^{d}}"></span>
</td>
<td style="background:#ff9090; color:black; vertical-align: middle; text-align: center;" class="table-no">아니요
</td>
<td style="background:#ff9090; color:black; vertical-align: middle; text-align: center;" class="table-no">아니요
</td></tr>
<tr align="center">
<td><a href="/w/index.php?title=%EC%8A%A4%ED%94%84%EB%A0%88%EB%93%9C%EC%86%8C%ED%8A%B8&amp;action=edit&amp;redlink=1" class="new" title="스프레드소트 (없는 문서)">스프레드소트</a>
</td>
<td style="background:#dfd"><link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml" style="font-style: italic;">n</span>
</td>
<td style="background:#dfd"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\cdot {\frac {k}{d}}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mo>⋅<!-- ⋅ --></mo>
        <mrow class="MJX-TeXAtom-ORD">
          <mfrac>
            <mi>k</mi>
            <mi>d</mi>
          </mfrac>
        </mrow>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\cdot {\frac {k}{d}}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/53166c305a8b1af047f2e4c916c4fd8a304d40d0" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -2.005ex; width:5.126ex; height:5.509ex;" alt="{\displaystyle n\cdot {\frac {k}{d}}}"></span>
</td>
<td style="background:#dfd"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\cdot \left({{\frac {k}{s}}+d}\right)}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mo>⋅<!-- ⋅ --></mo>
        <mrow>
          <mo>(</mo>
          <mrow class="MJX-TeXAtom-ORD">
            <mrow class="MJX-TeXAtom-ORD">
              <mfrac>
                <mi>k</mi>
                <mi>s</mi>
              </mfrac>
            </mrow>
            <mo>+</mo>
            <mi>d</mi>
          </mrow>
          <mo>)</mo>
        </mrow>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\cdot \left({{\frac {k}{s}}+d}\right)}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/2d48358944f0a173009b508f8e9699c87b382e86" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -2.505ex; width:12.599ex; height:6.176ex;" alt="{\displaystyle n\cdot \left({{\frac {k}{s}}+d}\right)}"></span>
</td>
<td><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle {\frac {k}{d}}\cdot 2^{d}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mrow class="MJX-TeXAtom-ORD">
          <mfrac>
            <mi>k</mi>
            <mi>d</mi>
          </mfrac>
        </mrow>
        <mo>⋅<!-- ⋅ --></mo>
        <msup>
          <mn>2</mn>
          <mrow class="MJX-TeXAtom-ORD">
            <mi>d</mi>
          </mrow>
        </msup>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle {\frac {k}{d}}\cdot 2^{d}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/bd0c10465a6c1dbad72bbbf80315ea93de959895" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -2.005ex; width:5.986ex; height:5.509ex;" alt="{\displaystyle {\frac {k}{d}}\cdot 2^{d}}"></span>
</td>
<td style="background:#ff9090; color:black; vertical-align: middle; text-align: center;" class="table-no">아니요
</td>
<td style="background:#ff9090; color:black; vertical-align: middle; text-align: center;" class="table-no">아니요
</td></tr>
<tr align="center">
<td><a href="/w/index.php?title=%EB%B2%84%EC%8A%A4%ED%8A%B8%EC%86%8C%ED%8A%B8&amp;action=edit&amp;redlink=1" class="new" title="버스트소트 (없는 문서)">버스트소트</a>
</td>
<td>—
</td>
<td style="background:#dfd"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\cdot {\frac {k}{d}}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mo>⋅<!-- ⋅ --></mo>
        <mrow class="MJX-TeXAtom-ORD">
          <mfrac>
            <mi>k</mi>
            <mi>d</mi>
          </mfrac>
        </mrow>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\cdot {\frac {k}{d}}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/53166c305a8b1af047f2e4c916c4fd8a304d40d0" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -2.005ex; width:5.126ex; height:5.509ex;" alt="{\displaystyle n\cdot {\frac {k}{d}}}"></span>
</td>
<td style="background:#dfd"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\cdot {\frac {k}{d}}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mo>⋅<!-- ⋅ --></mo>
        <mrow class="MJX-TeXAtom-ORD">
          <mfrac>
            <mi>k</mi>
            <mi>d</mi>
          </mfrac>
        </mrow>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\cdot {\frac {k}{d}}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/53166c305a8b1af047f2e4c916c4fd8a304d40d0" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -2.005ex; width:5.126ex; height:5.509ex;" alt="{\displaystyle n\cdot {\frac {k}{d}}}"></span>
</td>
<td><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\cdot {\frac {k}{d}}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mo>⋅<!-- ⋅ --></mo>
        <mrow class="MJX-TeXAtom-ORD">
          <mfrac>
            <mi>k</mi>
            <mi>d</mi>
          </mfrac>
        </mrow>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\cdot {\frac {k}{d}}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/53166c305a8b1af047f2e4c916c4fd8a304d40d0" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -2.005ex; width:5.126ex; height:5.509ex;" alt="{\displaystyle n\cdot {\frac {k}{d}}}"></span>
</td>
<td style="background:#ff9090; color:black; vertical-align: middle; text-align: center;" class="table-no">아니요
</td>
<td style="background:#ff9090; color:black; vertical-align: middle; text-align: center;" class="table-no">아니요
</td></tr>
<tr align="center">
<td><a href="/w/index.php?title=%ED%94%8C%EB%9E%98%EC%8B%9C%EC%86%8C%ED%8A%B8&amp;action=edit&amp;redlink=1" class="new" title="플래시소트 (없는 문서)">플래시소트</a>
</td>
<td style="background:#dfd"><link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml" style="font-style: italic;">n</span>
</td>
<td style="background:#dfd"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n+r}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mo>+</mo>
        <mi>r</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n+r}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/d6a5e6925440ca0c67b8608c15b3fc842d6b3199" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.505ex; width:5.284ex; height:2.176ex;" alt="n+r"></span>
</td>
<td style="background:#fdd"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n^{2}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <msup>
          <mi>n</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mn>2</mn>
          </mrow>
        </msup>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n^{2}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/ac9810bbdafe4a6a8061338db0f74e25b7952620" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.338ex; width:2.449ex; height:2.676ex;" alt="n^2"></span>
</td>
<td><link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml" style="font-style: italic;">n</span>
</td>
<td style="background:#ff9090; color:black; vertical-align: middle; text-align: center;" class="table-no">아니요
</td>
<td style="background:#ff9090; color:black; vertical-align: middle; text-align: center;" class="table-no">아니요
</td></tr>
<tr align="center">
<td><a href="/wiki/%EB%B2%84%ED%82%B7_%EC%A0%95%EB%A0%AC" title="버킷 정렬">포스트맨 정렬</a>
</td>
<td>—
</td>
<td style="background:#dfd"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\cdot {\frac {k}{d}}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mo>⋅<!-- ⋅ --></mo>
        <mrow class="MJX-TeXAtom-ORD">
          <mfrac>
            <mi>k</mi>
            <mi>d</mi>
          </mfrac>
        </mrow>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\cdot {\frac {k}{d}}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/53166c305a8b1af047f2e4c916c4fd8a304d40d0" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -2.005ex; width:5.126ex; height:5.509ex;" alt="{\displaystyle n\cdot {\frac {k}{d}}}"></span>
</td>
<td style="background:#dfd"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\cdot {\frac {k}{d}}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mo>⋅<!-- ⋅ --></mo>
        <mrow class="MJX-TeXAtom-ORD">
          <mfrac>
            <mi>k</mi>
            <mi>d</mi>
          </mfrac>
        </mrow>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\cdot {\frac {k}{d}}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/53166c305a8b1af047f2e4c916c4fd8a304d40d0" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -2.005ex; width:5.126ex; height:5.509ex;" alt="{\displaystyle n\cdot {\frac {k}{d}}}"></span>
</td>
<td><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n+2^{d}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <mo>+</mo>
        <msup>
          <mn>2</mn>
          <mrow class="MJX-TeXAtom-ORD">
            <mi>d</mi>
          </mrow>
        </msup>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n+2^{d}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/9b4a94f070d68b2a9f060bc5fd2baab07f1f1a94" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.505ex; width:6.49ex; height:2.843ex;" alt="{\displaystyle n+2^{d}}"></span>
</td>
<td>—
</td>
<td style="background:#ff9090; color:black; vertical-align: middle; text-align: center;" class="table-no">아니요
</td></tr></tbody><tfoot></tfoot></table>

### 기타

이 정렬 알고리즘은 보통 수행 시간을 예측하는데 사용되며, 실용적이지 못한 부분이 있다.

<table class="wikitable sortable jquery-tablesorter">
<thead><tr>
<th class="headerSort" tabindex="0" role="columnheader button" title="오름차순 정렬">이름</th>
<th class="headerSort" tabindex="0" role="columnheader button" title="오름차순 정렬">최선</th>
<th class="headerSort" tabindex="0" role="columnheader button" title="오름차순 정렬">평균</th>
<th class="headerSort" tabindex="0" role="columnheader button" title="오름차순 정렬">최악</th>
<th class="headerSort" tabindex="0" role="columnheader button" title="오름차순 정렬">메모리</th>
<th class="headerSort" tabindex="0" role="columnheader button" title="오름차순 정렬">안정</th>
<th class="headerSort" tabindex="0" role="columnheader button" title="오름차순 정렬">비교
</th></tr></thead><tbody>
<tr align="center">
<td><a href="/w/index.php?title=%EC%A3%BC%ED%8C%90_%EC%A0%95%EB%A0%AC&amp;action=edit&amp;redlink=1" class="new" title="주판 정렬 (없는 문서)">주판 정렬</a>
</td>
<td style="background:#dfd"><span data-sort-value="15&nbsp;!"><link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml" style="font-style: italic;">n</span></span>
</td>
<td style="background:#ffd"><span data-sort-value="23&nbsp;!"><link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml" style="font-style: italic;">S</span></span>
</td>
<td style="background:#ffd"><span data-sort-value="23&nbsp;!"><link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml" style="font-style: italic;">S</span></span>
</td>
<td style="background:#fdd"><span data-sort-value="25&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n^{2}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <msup>
          <mi>n</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mn>2</mn>
          </mrow>
        </msup>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n^{2}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/ac9810bbdafe4a6a8061338db0f74e25b7952620" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.338ex; width:2.449ex; height:2.676ex;" alt="n^2"></span></span>
</td>
<td style="background: #ececec; color: grey; vertical-align: middle; text-align: center;" class="table-na"><small>빈칸</small>
</td>
<td style="background:#ff9090; color:black; vertical-align: middle; text-align: center;" class="table-no">아니요
</td></tr>
<tr align="center">
<td><a href="/w/index.php?title=%ED%8C%AC%EC%BC%80%EC%9D%B4%ED%81%AC_%EC%A0%95%EB%A0%AC&amp;action=edit&amp;redlink=1" class="new" title="팬케이크 정렬 (없는 문서)">단순 팬케이크 정렬</a>
</td>
<td>—
</td>
<td><span data-sort-value="15&nbsp;!"><link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml" style="font-style: italic;">n</span></span>
</td>
<td><span data-sort-value="15&nbsp;!"><link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml" style="font-style: italic;">n</span></span>
</td>
<td><span data-sort-value="05&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle \log n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>log</mi>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle \log n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/317ab5292da7c7935aec01a570461fe0613b21d5" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:4.754ex; height:2.509ex;" alt="{\displaystyle \log n}"></span></span>
</td>
<td style="background:#ff9090; color:black; vertical-align: middle; text-align: center;" class="table-no">아니요
</td>
<td style="background: #90ff90; color: black; vertical-align: middle; text-align: center;" class="table-yes">예
</td></tr>
<tr align="center">
<td><a href="/w/index.php?title=%EC%8A%A4%ED%8C%8C%EA%B2%8C%ED%8B%B0_%EC%A0%95%EB%A0%AC&amp;action=edit&amp;redlink=1" class="new" title="스파게티 정렬 (없는 문서)">스파게티(폴) 정렬</a>
</td>
<td style="background:#dfd"><span data-sort-value="15&nbsp;!"><link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml" style="font-style: italic;">n</span></span>
</td>
<td style="background:#dfd"><span data-sort-value="15&nbsp;!"><link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml" style="font-style: italic;">n</span></span>
</td>
<td style="background:#dfd"><span data-sort-value="15&nbsp;!"><link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml" style="font-style: italic;">n</span></span>
</td>
<td style="background:#fdd"><span data-sort-value="25&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n^{2}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <msup>
          <mi>n</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mn>2</mn>
          </mrow>
        </msup>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n^{2}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/ac9810bbdafe4a6a8061338db0f74e25b7952620" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.338ex; width:2.449ex; height:2.676ex;" alt="n^2"></span></span>
</td>
<td style="background: #90ff90; color: black; vertical-align: middle; text-align: center;" class="table-yes">예
</td>
<td>폴링
</td></tr>
<tr align="center">
<td><a href="/w/index.php?title=%EC%A0%95%EB%A0%AC%EB%A7%9D&amp;action=edit&amp;redlink=1" class="new" title="정렬망 (없는 문서)">정렬망</a>
</td>
<td><span data-sort-value="06&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle \log ^{2}n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <msup>
          <mi>log</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mn>2</mn>
          </mrow>
        </msup>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle \log ^{2}n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/e34157f19d9344c513937dadab5cdc8fd86731dd" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:5.808ex; height:3.009ex;" alt="{\displaystyle \log ^{2}n}"></span></span>
</td>
<td><span data-sort-value="06&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle \log ^{2}n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <msup>
          <mi>log</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mn>2</mn>
          </mrow>
        </msup>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle \log ^{2}n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/e34157f19d9344c513937dadab5cdc8fd86731dd" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:5.808ex; height:3.009ex;" alt="{\displaystyle \log ^{2}n}"></span></span>
</td>
<td><span data-sort-value="06&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle \log ^{2}n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <msup>
          <mi>log</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mn>2</mn>
          </mrow>
        </msup>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle \log ^{2}n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/e34157f19d9344c513937dadab5cdc8fd86731dd" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:5.808ex; height:3.009ex;" alt="{\displaystyle \log ^{2}n}"></span></span>
</td>
<td><span data-sort-value="21&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\log ^{2}n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <msup>
          <mi>log</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mn>2</mn>
          </mrow>
        </msup>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\log ^{2}n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/8dcc3d3ab4d647731efd75119a13e8febd1a7e44" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:7.59ex; height:3.009ex;" alt="{\displaystyle n\log ^{2}n}"></span></span>
</td>
<td data-sort-value="" style="background: #ececec; color: #2C2C2C; vertical-align: middle; font-size: smaller; text-align: center;" class="table-na">다양함 (안정 정렬망은 더 많은 비교가 요구된다)
</td>
<td style="background: #90ff90; color: black; vertical-align: middle; text-align: center;" class="table-yes">예
</td></tr>
<tr align="center">
<td><a href="/w/index.php?title=%EB%B0%94%EC%9D%B4%ED%86%A0%EB%8B%89_%EC%A0%95%EB%A0%AC&amp;action=edit&amp;redlink=1" class="new" title="바이토닉 정렬 (없는 문서)">바이토닉 정렬</a>
</td>
<td><span data-sort-value="06&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle \log ^{2}n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <msup>
          <mi>log</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mn>2</mn>
          </mrow>
        </msup>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle \log ^{2}n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/e34157f19d9344c513937dadab5cdc8fd86731dd" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:5.808ex; height:3.009ex;" alt="{\displaystyle \log ^{2}n}"></span></span>
</td>
<td><span data-sort-value="06&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle \log ^{2}n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <msup>
          <mi>log</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mn>2</mn>
          </mrow>
        </msup>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle \log ^{2}n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/e34157f19d9344c513937dadab5cdc8fd86731dd" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:5.808ex; height:3.009ex;" alt="{\displaystyle \log ^{2}n}"></span></span>
</td>
<td><span data-sort-value="06&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle \log ^{2}n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <msup>
          <mi>log</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mn>2</mn>
          </mrow>
        </msup>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle \log ^{2}n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/e34157f19d9344c513937dadab5cdc8fd86731dd" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:5.808ex; height:3.009ex;" alt="{\displaystyle \log ^{2}n}"></span></span>
</td>
<td><span data-sort-value="21&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n\log ^{2}n}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi>n</mi>
        <msup>
          <mi>log</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mn>2</mn>
          </mrow>
        </msup>
        <mo>⁡<!-- ⁡ --></mo>
        <mi>n</mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n\log ^{2}n}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/8dcc3d3ab4d647731efd75119a13e8febd1a7e44" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.671ex; width:7.59ex; height:3.009ex;" alt="{\displaystyle n\log ^{2}n}"></span></span>
</td>
<td style="background:#ff9090; color:black; vertical-align: middle; text-align: center;" class="table-no">아니요
</td>
<td style="background: #90ff90; color: black; vertical-align: middle; text-align: center;" class="table-yes">예
</td></tr>
<tr align="center">
<td><a href="/wiki/%EB%B3%B4%EA%B3%A0%EC%A0%95%EB%A0%AC" title="보고정렬">보고정렬</a>
</td>
<td style="background:#dfd"><span data-sort-value="15&nbsp;!"><link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml" style="font-style: italic;">n</span></span>
</td>
<td style="background:#fdd"><span data-sort-value="99&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle (n\times n!)}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mo stretchy="false">(</mo>
        <mi>n</mi>
        <mo>×<!-- × --></mo>
        <mi>n</mi>
        <mo>!</mo>
        <mo stretchy="false">)</mo>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle (n\times n!)}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/dbae6d0fe4f4f73c8e3261b474927a92ac9fd9b9" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.838ex; width:8.086ex; height:2.843ex;" alt="{\displaystyle (n\times n!)}"></span></span>
</td>
<td style="background:#fdd"><span data-sort-value="99&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle \infty }">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <mi mathvariant="normal">∞<!-- ∞ --></mi>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle \infty }</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/c26c105004f30c27aa7c2a9c601550a4183b1f21" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.338ex; width:2.324ex; height:1.676ex;" alt="\infty"></span></span>
</td>
<td style="background:#dfd"><span data-sort-value="00&nbsp;!">1</span>
</td>
<td style="background:#ff9090; color:black; vertical-align: middle; text-align: center;" class="table-no">아니요
</td>
<td style="background: #90ff90; color: black; vertical-align: middle; text-align: center;" class="table-yes">예
</td></tr>
<tr align="center">
<td><a href="/w/index.php?title=%EA%BC%AD%EB%91%90%EA%B0%81%EC%8B%9C_%EC%A0%95%EB%A0%AC&amp;action=edit&amp;redlink=1" class="new" title="꼭두각시 정렬 (없는 문서)">꼭두각시 정렬</a>
</td>
<td style="background:#fdd"><span data-sort-value="30&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n^{\log 3/\log 1.5}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <msup>
          <mi>n</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mi>log</mi>
            <mo>⁡<!-- ⁡ --></mo>
            <mn>3</mn>
            <mrow class="MJX-TeXAtom-ORD">
              <mo>/</mo>
            </mrow>
            <mi>log</mi>
            <mo>⁡<!-- ⁡ --></mo>
            <mn>1.5</mn>
          </mrow>
        </msup>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n^{\log 3/\log 1.5}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/4de187624d1b78cfc152f4b1fd4eb669c4f5a9fe" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.338ex; width:10.736ex; height:2.843ex;" alt="{\displaystyle n^{\log 3/\log 1.5}}"></span></span>
</td>
<td style="background:#fdd"><span data-sort-value="30&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n^{\log 3/\log 1.5}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <msup>
          <mi>n</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mi>log</mi>
            <mo>⁡<!-- ⁡ --></mo>
            <mn>3</mn>
            <mrow class="MJX-TeXAtom-ORD">
              <mo>/</mo>
            </mrow>
            <mi>log</mi>
            <mo>⁡<!-- ⁡ --></mo>
            <mn>1.5</mn>
          </mrow>
        </msup>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n^{\log 3/\log 1.5}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/4de187624d1b78cfc152f4b1fd4eb669c4f5a9fe" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.338ex; width:10.736ex; height:2.843ex;" alt="{\displaystyle n^{\log 3/\log 1.5}}"></span></span>
</td>
<td style="background:#fdd"><span data-sort-value="30&nbsp;!"><span class="mwe-math-element"><span class="mwe-math-mathml-inline mwe-math-mathml-a11y" style="display: none;"><math xmlns="http://www.w3.org/1998/Math/MathML" alttext="{\displaystyle n^{\log 3/\log 1.5}}">
  <semantics>
    <mrow class="MJX-TeXAtom-ORD">
      <mstyle displaystyle="true" scriptlevel="0">
        <msup>
          <mi>n</mi>
          <mrow class="MJX-TeXAtom-ORD">
            <mi>log</mi>
            <mo>⁡<!-- ⁡ --></mo>
            <mn>3</mn>
            <mrow class="MJX-TeXAtom-ORD">
              <mo>/</mo>
            </mrow>
            <mi>log</mi>
            <mo>⁡<!-- ⁡ --></mo>
            <mn>1.5</mn>
          </mrow>
        </msup>
      </mstyle>
    </mrow>
    <annotation encoding="application/x-tex">{\displaystyle n^{\log 3/\log 1.5}}</annotation>
  </semantics>
</math></span><img src="https://wikimedia.org/api/rest_v1/media/math/render/svg/4de187624d1b78cfc152f4b1fd4eb669c4f5a9fe" class="mwe-math-fallback-image-inline" aria-hidden="true" style="vertical-align: -0.338ex; width:10.736ex; height:2.843ex;" alt="{\displaystyle n^{\log 3/\log 1.5}}"></span></span>
</td>
<td style="background:#fdd"><span data-sort-value="15&nbsp;!"><link rel="mw-deduplicated-inline-style" href="mw-data:TemplateStyles:r25030363"><span class="texhtml" style="font-style: italic;">n</span></span>
</td>
<td style="background:#ff9090; color:black; vertical-align: middle; text-align: center;" class="table-no">아니요
</td>
<td style="background: #90ff90; color: black; vertical-align: middle; text-align: center;" class="table-yes">예
</td></tr></tbody><tfoot></tfoot></table>

정렬 알고리즘 종류
==================

1. 비교 정렬

원소들을 정렬할 때 순서에만 의존하는 알고리즘이다.
숫자, 문자열, 심지어 복잡한 객체에도 순서가 결정되어 있다면 적용 가능하다.

비교 정렬은 아무리 빨라도 최악 시간복잡도는 Ω (n log n) 시간이 필요하다.
비교 정렬 아닌 알고리즘은 이런 시간복잡도의 특성에 대한 제약이 없지만, 더 느린 경우도 존재한다.

2. 제자리 정렬

제자리 정렬은 O(1) 의 저장 공간만을 사용하는 정렬 알고리즘이다.
대표적인 예로 삽입 정렬이 포함하며, 원소들을 옮기기 위해 임시 저장공간만을 사용하여 옮기는 것이 특징이다.

퀵 정렬과 같은 경우 알고리즘 정의에 따라 재귀적으로 스택을 사용하여 제자리 정렬로 분류될 수도 있고 아닐 수도 있다.

3. 온라인 정렬

모든 원소를 모두 주어지지 않고 차례대로 들어 오는 경우에 사용되는 알고리즘으로 대표적인 예로 합병 정렬이 있다.
여러 리스트에 분리하여 관리하다가 원소가 들어올 때마다 적절한 리스트를 추가하며 합병하는 방식이다.

