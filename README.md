# 易于使用的事件管理系统
<p>（应该通用吧）的Event管理系统</p>

## 如是使用?
public static EventManager eventManager;
eventManager = new EventManager();
## 注册
EventManager.register(this);
EventManager.unregister(this);
## 事件
EventManager.callEvent();
