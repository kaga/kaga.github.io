layout: post
title:  "Waterfall"
date:   2021-01-18 21:05:49 +1300
categories: Dev
---

![Waterfall Finial](../images/Waterfall_4.jpeg)

The word “Waterfall” often talked about in the software development world. Sometimes it is being used as a “dirty” word in a conversation as a reason to go “agile”, without much understanding to the methodology.

很多人成日都放「Waterfall」喺嘴邊，但有幾多人真正地了解過它的意思？還是只是用來作為「Agile」的對立面？用來把自己放在高一個層次從而鄙視其他人？

This is an introduction to the Winston Royce’s original paper on 
[Managing the Development Of Large Software Systems](https://leadinganswers.typepad.com/leading_answers/files/original_waterfall_paper_winston_royce.pdf).

這是一個簡單分成三部分介紹 Winston Royce 關於設計大型系統的文章。

## Version 0.1 - Analysis -> Coding 

![Waterfall 0.1](../images/Waterfall_1.jpeg)

This is as simple as the title suggests. This strategy works well when the work is fairly simple, such as a “single page” application or feature enhancement to an existing solution. The whole process usually goes for few months and rarely past a year. 

當手頭上是很簡單的 Project，例如只有一頁 User Interface 或姐係 implement 一個 feature 這些可以用數個月便完成。這個「三思而後行」是一個很直接而可行的方法。特別在一般 Small and Midsize Business (SMB)，你可能是整間公司唯一一個 Developer 或姐成個 IT 部門都係 Developer 而沒有其他職位。 

It can be a logical decision to use this method, simply because as a sole developer in SMB or the team size were small and mostly consist of developers.

In some company, the work might classified as BAU ( Business As Usual ) and not recognized as company’s objectives, i.e. not being run as a “project”. 

Sometimes a project might have project managers, development managers, and even involving customers in the process. However they are here for symbolic reasons and the project still run this method in essence.

It is difficult to have complex projects successfully implemented using this method.

除左自身或環境因素，有時候因為公司的預算的方式而硬分了 Project 和 BAU。Project 會有所有的資源，如有購買器材的能力和有時間去收集 Requirement。成果受到公司肯定。BAU 沒有資源和時間，常被視為所有非 Project 的黑洞。

雖然最後成品會有「頭痛醫頭，腳痛醫腳」，但想完成 BAU 以内的工作很多時都只能這樣。就算是 Project based 的工作，如果其他人只係形式上存在而變成 Developer 獨自負擔的話，其實都只是這一個  Methodology 的變體。很難在大型系統中成功用這個方法。

## Waterfall 1.0 - The Infamous “Waterfall” Model 


The is widely misunderstood as “the waterfall” model and commonly used. I think the misconception came from the author described the concept with the famous graph too soon and reader took it as a gist of “waterfall” and stopped reading. 

通常人們一想到 Waterfall，就會想到這一個方法。 我想這是因為作者在形容這一個方法時先放了圖。而我地生於電視、網絡社交媒體的世代，第一時間受到圖像的吸引，以為這就是 Waterfall 的精髓而失去了解下去的能力。

In the immediate below the graph, which the author ironically wrote:

特別諷刺的是，這是接下來在圖解以下寫的。
 
```
The implementation described above is risky and invites failure
```

Companies that declared “gone agile” could actually using this methodology in disguise. They would use this methodology and its “patched versions” incorporated “Agile” practices such as daily standup and sprints. In this model, customer has little to no choices or controls in the finial outcome of the product. It is common to discover towards the end of the project phase, the product does not actually meet customer requirement. It is almost up to chance that the project to get back to design and requirement stage and start again.

有些公司會利用了 Daily standup 和其他新興的「習俗」，但本質上是這個方法。這一個方法中，層與層之間，如 Software Requirement 和 Analysis 的溝通係十分有限。用家係幾乎沒有影響最後成品的機會。當出了根本性問題時，這一個方法很難去給人重新檢視成個計劃。

```
Release note for version 1.1
- Added interaction between various phases 

Release note for version 1.2 
- Added ability to jump back to program design & software requirement 
```

![Waterfall v1.2](../images/Waterfall_3.jpeg)

With the modern culture of expecting projects to overrun and delay. The disadvantages of this method are often ignored, and going further to different models will be difficult. 

依家人普遍都習慣了 Software Development 就係會延遲同貴，而且當大家忽略運用這個方法去建設一個大型系統的缺點，就很難去檢視用其他可能更加好的方法。

---

## Waterfall 2.0 - What Royce’s Wanted 

![Waterfall Finial](../images/Waterfall_4.jpeg)￼

The picture at the start of this blog was actually describe this model. I put it up there to mess with you.

吸收了 Royce’s 的經驗，我放了這個方法的圖，目的就係為左令你對 Waterfall Methodology 的套板印象產生沖擊。

I see this as early version of Agile with introduction of “Preliminary Program Design Phase” before analysis, which design the process, data models and produce an overview document.

It also introduced the idea of “pilot program” to shorten the initial release cycle, truly working with the customer and the concept of peer code-review and unit testing.

這個方法如果細心對比，其實和現代的 Agile Methodology 十分相近。加了 “Preliminary Program Design Phase” 來減少 Bugs。加上先利用 Customer 和 Pilot Program 去加快得到回饋意見，在 Development 的技考上，也有 Peer code-review 和 Unit testing。

The biggest difference to Agile methodology in my opinion was the emphasis on documentation. The author said everything should be documented and tester can read and figure out what to do from the documentation. Sadly in the age of social media, most people no longer interested in reading and we cleverly addressed it in Agile methodology or technologies. It has been getting difficult to have people concentrated in an hour long YouTube video let alone reading or writing pages of documentation.

我想這個方法和 Agile 最大的分別就是大量的技術文件，務求所有的知識都可以在文件中找到。但在這個資訊爆炸即食文化年代，越來越難令人專心去讀和寫文件。似乎Agile 對這一個議題的想法是比較好。

## Conclusion 

Although I have used versioning to progressively introduce the full picture of the model. I don’t think Waterfall and Agile is a binary option, nor implying Agile / [Insert your favorite methodology here] is better than Waterfall. 

我最後會給人錯覺暗指 Waterfall 2.0 是 Agile 的 Beta 版。其實我用了 Versioning 去分作者的思路，別無他意。我是覺得 Waterfall 和 Agile 不是一個二元對立、非黑即白。更加不是要證明 Agile 比 Waterfall 更好。

There are different models discussed in the original paper and how companies surprisingly has been employing it, intentionally or unintentionally. I encourage everyone, especially who just started in the software development career, to read Winston Royce’s paper. 

希望這一篇導讀可以令你了解到 Waterfall 也有不同的「層次」，如果你係初出茅蘆或其他做呢行的人，我會十分推介你去細讀佢的原文章。

[Managing the Development Of Large Software Systems](https://leadinganswers.typepad.com/leading_answers/files/original_waterfall_paper_winston_royce.pdf)

[Programming is terrible—Lessons learned from a life wasted. EMF2012](https://www.youtube.com/watch?v=csyL9EC0S0c&feature=emb_title)

