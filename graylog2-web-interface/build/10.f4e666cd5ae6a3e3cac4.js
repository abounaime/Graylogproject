webpackJsonp([10],{1024:function(e,exports,t){"use strict";function n(e){return e&&e.__esModule?e:{default:e}}Object.defineProperty(exports,"__esModule",{value:!0});var i=t(2),a=n(i),o=t(1),r=n(o),l=t(15),s=t(86),u=n(s),d=t(966),f=u.default.get("AlertConditions"),c=f.AlertConditionsActions,p=f.AlertConditionsStore,m=a.default.createClass({displayName:"AlertCondition",propTypes:{alertCondition:a.default.PropTypes.object.isRequired,stream:a.default.PropTypes.object},mixins:[r.default.connect(p)],_onDelete:function(){window.confirm("Really delete alert condition?")&&c.delete(this.props.stream.id,this.props.alertCondition.id)},render:function(){var e=this.props.alertCondition.type,t=this.props.stream,n=this.props.alertCondition,i=this.state.types[e];if(!i)return a.default.createElement(d.UnknownAlertCondition,{alertCondition:n,onDelete:this._onDelete,stream:t});var o=[a.default.createElement(l.DropdownButton,{key:"more-actions-button",title:"Actions",pullRight:!0,id:"more-actions-dropdown-"+n.id},a.default.createElement(l.MenuItem,{onSelect:this._onDelete},"Delete"))];return a.default.createElement(d.AlertConditionSummary,{alertCondition:n,typeDefinition:i,stream:t,actions:o,linkToDetails:!0})}});exports.default=m,e.exports=exports.default},1025:function(e,exports,t){"use strict";function n(e){return e&&e.__esModule?e:{default:e}}Object.defineProperty(exports,"__esModule",{value:!0});var i=t(2),a=n(i),o=t(1),r=n(o),l=t(15),s=t(962),u=t(86),d=n(u),f=d.default.get("AlertConditions"),c=f.AlertConditionsStore,p=a.default.createClass({displayName:"AlertConditionForm",propTypes:{alertCondition:a.default.PropTypes.object,onCancel:a.default.PropTypes.func,onSubmit:a.default.PropTypes.func.isRequired,type:a.default.PropTypes.string.isRequired},mixins:[r.default.connect(c)],getDefaultProps:function(){return{onCancel:function(){},onSubmit:function(){}}},getValue:function(){var e=this.refs.configurationForm.getValue();return{title:e.title,type:this.props.type,parameters:e.configuration}},open:function(){this.refs.configurationForm.open()},_onCancel:function(){this.props.onCancel()},_onSubmit:function(){var e=this.getValue();this.props.onSubmit(e)},_formatTitle:function(e,t){var n=e?"Update":"Create new",i=e?a.default.createElement("em",null,e.title||"Untitled"):t;return a.default.createElement("span",null,n," ",i)},render:function(){var e=this.props.type,t=this.props.alertCondition,n=this.state.types[e];return a.default.createElement(s.ConfigurationForm,{ref:"configurationForm",key:"configuration-form-alert-condition",configFields:n.requested_configuration,title:this._formatTitle(t,n.name),typeName:e,submitAction:this._onSubmit,cancelAction:this._onCancel,titleValue:t?t.title:"",helpBlock:"The alert condition title",values:t?t.parameters:{}},a.default.createElement(l.FormGroup,null,a.default.createElement(l.ControlLabel,null,n.name+" description"),a.default.createElement(l.FormControl.Static,null,n.human_name)))}});exports.default=p,e.exports=exports.default},1026:function(e,exports,t){"use strict";function n(e){return e&&e.__esModule?e:{default:e}}Object.defineProperty(exports,"__esModule",{value:!0});var i=t(2),a=n(i),o=t(15),r=t(958),l=t(75),s=n(l),u=t(48),d=t(966),f=t(262),c=a.default.createClass({displayName:"AlertConditionSummary",propTypes:{alertCondition:a.default.PropTypes.object.isRequired,typeDefinition:a.default.PropTypes.object.isRequired,stream:a.default.PropTypes.object,actions:a.default.PropTypes.array.isRequired,linkToDetails:a.default.PropTypes.bool},render:function(){var e=this.props.stream,t=this.props.alertCondition,n=this.props.typeDefinition,i=f.PluginStore.exports("alertConditions").find(function(e){return e.type===t.type})||{},l=i.summaryComponent||d.GenericAlertConditionSummary,c=e?a.default.createElement("span",null,"Alerting on stream ",a.default.createElement("em",null,e.title)):"Not alerting on any stream",p=a.default.createElement(o.Col,{md:12},a.default.createElement("strong",null,"Configuration:")," ",a.default.createElement(l,{alertCondition:t})),m=void 0;return m=this.props.linkToDetails?a.default.createElement(r.LinkContainer,{to:s.default.show_alert_condition(e.id,t.id)},a.default.createElement("a",null,t.title?t.title:"Untitled")):t.title?t.title:"Untitled",a.default.createElement(u.EntityListItem,{key:"entry-list-"+t.id,title:m,titleSuffix:"("+n.name+")",description:c,actions:this.props.actions,contentRow:p})}});exports.default=c,e.exports=exports.default},1027:function(e,exports,t){"use strict";function n(e){return e&&e.__esModule?e:{default:e}}Object.defineProperty(exports,"__esModule",{value:!0});var i=t(2),a=n(i),o=t(1),r=n(o),l=t(15),s=t(958),u=t(960),d=n(u),f=t(48),c=t(966),p=t(75),m=n(p),h=t(86),y=n(h),C=y.default.get("Streams"),g=C.StreamsStore,_=y.default.get("AlertConditions"),E=_.AlertConditionsStore,v=_.AlertConditionsActions,b=a.default.createClass({displayName:"AlertConditionsComponent",mixins:[r.default.connect(E)],getInitialState:function(){return{streams:void 0}},componentDidMount:function(){this._loadData()},_loadData:function(){var e=this;g.listStreams().then(function(t){e.setState({streams:t})}),v.listAll()},_isLoading:function(){return!this.state.streams||!this.state.allAlertConditions},render:function(){if(this._isLoading())return a.default.createElement(f.Spinner,null);var e=this.state.allAlertConditions.sort(function(e,t){var n=e.title||"Untitled",i=t.title||"Untitled";return(0,d.default)(n.toLowerCase(),i.toLowerCase())});return a.default.createElement("div",null,a.default.createElement("div",{className:"pull-right"},a.default.createElement(s.LinkContainer,{to:m.default.ALERTS.NEW_CONDITION},a.default.createElement(l.Button,{bsStyle:"success"},"Add new condition"))),a.default.createElement("h2",null,"Conditions"),a.default.createElement("p",null,"These are all configured alert conditions."),a.default.createElement(c.AlertConditionsList,{alertConditions:e,streams:this.state.streams}))}});exports.default=b,e.exports=exports.default},1028:function(e,exports,t){"use strict";Object.defineProperty(exports,"__esModule",{value:!0});var n=t(2),i=function(e){return e&&e.__esModule?e:{default:e}}(n),a=t(966),o=t(48),r=i.default.createClass({displayName:"AlertConditionsList",propTypes:{alertConditions:i.default.PropTypes.array.isRequired,streams:i.default.PropTypes.array.isRequired},getInitialState:function(){return{currentPage:0}},PAGE_SIZE:10,_onChangePaginatedList:function(e){this.setState({currentPage:e-1})},_paginatedConditions:function(){return this.props.alertConditions.slice(this.state.currentPage*this.PAGE_SIZE,(this.state.currentPage+1)*this.PAGE_SIZE)},_formatCondition:function(e){var t=this.props.streams.find(function(t){return t.alert_conditions.find(function(t){return t.id===e.id})});return i.default.createElement(a.AlertCondition,{key:e.id,alertCondition:e,stream:t})},render:function(){var e=this,t=this.props.alertConditions;return i.default.createElement(o.PaginatedList,{totalItems:t.length,onChange:this._onChangePaginatedList,showPageSizeSelect:!1,pageSize:this.PAGE_SIZE},i.default.createElement(o.EntityList,{bsNoItemsStyle:"info",noItemsText:"There are no configured conditions.",items:this._paginatedConditions().map(function(t){return e._formatCondition(t)})}))}});exports.default=r,e.exports=exports.default},1029:function(e,exports,t){"use strict";function n(e){return e&&e.__esModule?e:{default:e}}Object.defineProperty(exports,"__esModule",{value:!0});var i=t(2),a=n(i),o=t(960),r=n(o),l=t(48),s=t(964),u=t(86),d=n(u),f=d.default.get("AlarmCallbacks"),c=f.AlarmCallbacksActions,p=d.default.get("AlertNotifications"),m=p.AlertNotificationsActions,h=a.default.createClass({displayName:"ConditionAlertNotifications",propTypes:{alertCondition:a.default.PropTypes.object.isRequired,stream:a.default.PropTypes.object.isRequired},getInitialState:function(){return{conditionNotifications:void 0}},componentDidMount:function(){this._loadData()},_loadData:function(){var e=this;m.available(),c.list(this.props.stream.id).then(function(t){return e.setState({conditionNotifications:t})})},_isLoading:function(){return!this.state.conditionNotifications},render:function(){if(this._isLoading())return a.default.createElement(l.Spinner,null);var e=this.props.stream,t=this.state.conditionNotifications.sort(function(e,t){var n=e.title||"Untitled",i=t.title||"Untitled";return(0,r.default)(n.toLowerCase(),i.toLowerCase())});return a.default.createElement("div",null,a.default.createElement("h2",null,"Notifications"),a.default.createElement("p",null,a.default.createElement(l.Pluralize,{value:t.length,singular:"This is",plural:"These are"})," the notifications set for the stream ",a.default.createElement("em",null,e.title),". They will be triggered when the alert condition is satisfied."),a.default.createElement(s.AlertNotificationsList,{alertNotifications:t,streams:[this.props.stream],onNotificationUpdate:this._loadData,onNotificationDelete:this._loadData}))}});exports.default=h,e.exports=exports.default},1030:function(e,exports,t){"use strict";function n(e){return e&&e.__esModule?e:{default:e}}Object.defineProperty(exports,"__esModule",{value:!0});var i=t(2),a=n(i),o=t(1),r=n(o),l=t(960),s=n(l),u=t(15),d=t(49),f=t(48),c=t(966),p=t(75),m=n(p),h=t(5),y=n(h),C=t(169),g=n(C),_=t(86),E=n(_),v=E.default.get("AlertConditions"),b=v.AlertConditionsStore,S=v.AlertConditionsActions,A=E.default.get("Streams"),N=A.StreamsStore,P=a.default.createClass({displayName:"CreateAlertConditionInput",mixins:[r.default.connect(b)],getInitialState:function(){return{streams:void 0,selectedStream:void 0,type:this.PLACEHOLDER}},componentDidMount:function(){var e=this;N.listStreams().then(function(t){e.setState({streams:t})})},PLACEHOLDER:"placeholder",_onChange:function(e){this.setState({type:e.target.value})},_onStreamChange:function(e){this.setState({selectedStream:this.state.streams.find(function(t){return t.id===e})})},_onSubmit:function(e){var t=this;this.state.selectedStream||y.default.error("Please select the stream that the condition should check.","Could not save condition"),S.save(this.state.selectedStream.id,e).then(function(e){g.default.pushState(null,m.default.show_alert_condition(t.state.selectedStream.id,e))})},_openForm:function(){this.refs.configurationForm.open()},_resetForm:function(){this.setState({type:this.PLACEHOLDER})},_formatConditionForm:function(e){return a.default.createElement(c.AlertConditionForm,{ref:"configurationForm",onCancel:this._resetForm,onSubmit:this._onSubmit,type:e})},_formatOption:function(e,t){return{value:t,label:e}},_isLoading:function(){return!this.state.types||!this.state.streams},render:function(){var e=this;if(this._isLoading())return a.default.createElement(f.Spinner,null);var t=this.state.type!==this.PLACEHOLDER?this._formatConditionForm(this.state.type):null,n=Object.keys(this.state.types).map(function(t){return a.default.createElement("option",{key:"type-option-"+t,value:t},e.state.types[t].name)}),i=this.state.streams.map(function(t){return e._formatOption(t.title,t.id)}).sort(function(e,t){return(0,s.default)(e.label.toLowerCase(),t.label.toLowerCase())});return a.default.createElement("div",null,a.default.createElement("h2",null,"Condition"),a.default.createElement("p",{className:"description"},"Define the condition to evaluate when triggering a new alert."),a.default.createElement(u.Row,null,a.default.createElement(u.Col,{md:6},a.default.createElement("form",null,a.default.createElement(d.Input,{label:"Alert on stream",help:"Select the stream that the condition will use to trigger alerts."},a.default.createElement(f.Select,{placeholder:"Select a stream",options:i,onValueChange:this._onStreamChange})),a.default.createElement(d.Input,{type:"select",value:this.state.type,onChange:this._onChange,disabled:!this.state.selectedStream,label:"Condition type",help:"Select the condition type that will be used."},a.default.createElement("option",{value:this.PLACEHOLDER,disabled:!0},"Select a condition type"),n),t," ",a.default.createElement(u.Button,{onClick:this._openForm,disabled:this.state.type===this.PLACEHOLDER,bsStyle:"success"},"Add alert condition")))))}});exports.default=P,e.exports=exports.default},1031:function(e,exports,t){"use strict";function n(e){return e&&e.__esModule?e:{default:e}}Object.defineProperty(exports,"__esModule",{value:!0});var i=t(2),a=n(i),o=t(1),r=n(o),l=t(15),s=t(48),u=t(966),d=t(86),f=n(d),c=f.default.get("AlertConditions"),p=c.AlertConditionsActions,m=c.AlertConditionsStore,h=a.default.createClass({displayName:"EditAlertConditionForm",propTypes:{alertCondition:a.default.PropTypes.object.isRequired,stream:a.default.PropTypes.object.isRequired},mixins:[r.default.connect(m)],_onEdit:function(){this.refs.updateForm.open()},_onUpdate:function(e){var t=this;p.update(this.props.stream.id,this.props.alertCondition.id,e).then(function(){p.get(t.props.stream.id,t.props.alertCondition.id)})},_formatCondition:function(){var e=this.props.alertCondition.type,t=this.props.stream,n=this.props.alertCondition,i=this.state.types[e],o=[a.default.createElement(l.Button,{key:"edit-button",bsStyle:"info",onClick:this._onEdit},"Edit")];return[a.default.createElement(u.AlertConditionSummary,{key:"alert-condition-"+n.id,alertCondition:n,typeDefinition:i,stream:t,actions:o})]},_isLoading:function(){return!this.state.types},render:function(){if(this._isLoading())return a.default.createElement(s.Spinner,null);var e=this.props.alertCondition;return a.default.createElement("div",null,a.default.createElement("h2",null,"Condition details"),a.default.createElement("p",null,"Define the condition to evaluate when triggering a new alert."),a.default.createElement(u.AlertConditionForm,{ref:"updateForm",type:e.type,alertCondition:e,onSubmit:this._onUpdate}),a.default.createElement(s.EntityList,{items:this._formatCondition()}))}});exports.default=h,e.exports=exports.default},1032:function(e,exports,t){"use strict";function n(e){return e&&e.__esModule?e:{default:e}}Object.defineProperty(exports,"__esModule",{value:!0});var i=t(2),a=n(i),o=t(962),r=t(970),l=n(r),s=t(969),u=n(s),d=a.default.createClass({displayName:"GenericAlertConditionSummary",propTypes:{alertCondition:a.default.PropTypes.object.isRequired},render:function(){var e=this.props.alertCondition,t=e.parameters.grace?a.default.createElement(l.default,{alertCondition:e}):null,n=e.parameters.backlog?a.default.createElement(u.default,{alertCondition:e}):null;return a.default.createElement("span",null,t," ",n,a.default.createElement(o.ConfigurationWell,{configuration:e.parameters}))}});exports.default=d,e.exports=exports.default},1033:function(e,exports,t){"use strict";Object.defineProperty(exports,"__esModule",{value:!0});var n=t(2),i=function(e){return e&&e.__esModule?e:{default:e}}(n),a=t(15),o=t(48),r=i.default.createClass({displayName:"UnknownAlertCondition",propTypes:{alertCondition:i.default.PropTypes.object.isRequired,stream:i.default.PropTypes.object,onDelete:i.default.PropTypes.func.isRequired},render:function(){var e=this.props.alertCondition,t=this.props.stream,n=[i.default.createElement(a.DropdownButton,{key:"actions-button",title:"Actions",pullRight:!0,id:"more-actions-dropdown-"+e.id},i.default.createElement(a.MenuItem,{onSelect:this.props.onDelete},"Delete"))],r=i.default.createElement(a.Col,{md:12},i.default.createElement(a.Alert,{bsStyle:"warning"},"Could not resolve condition type. This is most likely caused by a missing plugin in your Graylog setup."));return i.default.createElement(o.EntityListItem,{key:"entry-list-"+e.id,title:"Unknown condition",titleSuffix:"("+e.type+")",description:t?i.default.createElement("span",null,"Watching stream ",i.default.createElement("em",null,t.title)):"Not watching any stream",actions:n,contentRow:r})}});exports.default=r,e.exports=exports.default},1034:function(e,exports,t){"use strict";function n(e){return e&&e.__esModule?e:{default:e}}Object.defineProperty(exports,"__esModule",{value:!0});var i=t(2),a=n(i),o=t(970),r=n(o),l=t(969),s=n(l),u=t(972),d=n(u),f=a.default.createClass({displayName:"FieldContentConditionSummary",propTypes:{alertCondition:a.default.PropTypes.object.isRequired},_formatMatcher:function(e,t){return a.default.createElement("span",null,"<"+e+': "'+t+'">')},render:function(){var e=this.props.alertCondition,t=e.parameters.field,n=e.parameters.value;return a.default.createElement("span",null,"Alert is triggered when messages matching ",this._formatMatcher(t,n)," are received."," ",a.default.createElement(r.default,{alertCondition:e})," ",a.default.createElement(s.default,{alertCondition:e})," ",a.default.createElement(d.default,{alertCondition:e}))}});exports.default=f,e.exports=exports.default},1035:function(e,exports,t){"use strict";function n(e){return e&&e.__esModule?e:{default:e}}Object.defineProperty(exports,"__esModule",{value:!0});var i=t(1034);Object.defineProperty(exports,"FieldContentConditionSummary",{enumerable:!0,get:function(){return n(i).default}})},1036:function(e,exports,t){"use strict";function n(e){return e&&e.__esModule?e:{default:e}}Object.defineProperty(exports,"__esModule",{value:!0});var i=t(2),a=n(i),o=t(970),r=n(o),l=t(969),s=n(l),u=t(972),d=n(u),f=t(48),c=a.default.createClass({displayName:"FieldValueConditionSummary",propTypes:{alertCondition:a.default.PropTypes.object.isRequired},render:function(){var e=this.props.alertCondition,t=e.parameters.field,n=e.parameters.threshold,i=e.parameters.threshold_type.toLowerCase(),o=e.parameters.type.toLowerCase(),l=e.parameters.time;return a.default.createElement("span",null,"Alert is triggered when the field ",t," has a ",i," ",o," value than ",n," in the"," ",a.default.createElement(f.Pluralize,{value:l,singular:"last minute",plural:"last "+l+" minutes"}),"."," ",a.default.createElement(r.default,{alertCondition:e})," ",a.default.createElement(s.default,{alertCondition:e})," ",a.default.createElement(d.default,{alertCondition:e}))}});exports.default=c,e.exports=exports.default},1037:function(e,exports,t){"use strict";function n(e){return e&&e.__esModule?e:{default:e}}Object.defineProperty(exports,"__esModule",{value:!0});var i=t(1036);Object.defineProperty(exports,"FieldValueConditionSummary",{enumerable:!0,get:function(){return n(i).default}})},1038:function(e,exports,t){"use strict";function n(e){return e&&e.__esModule?e:{default:e}}Object.defineProperty(exports,"__esModule",{value:!0});var i=t(2),a=n(i),o=t(970),r=n(o),l=t(969),s=n(l),u=t(972),d=n(u),f=t(48),c=a.default.createClass({displayName:"MessageCountConditionSummary",propTypes:{alertCondition:a.default.PropTypes.object.isRequired},render:function(){var e=this.props.alertCondition,t=e.parameters.threshold,n=e.parameters.threshold_type.toLowerCase(),i=e.parameters.time;return a.default.createElement("span",null,"Alert is triggered when there"," ",a.default.createElement(f.Pluralize,{value:t,singular:"is "+n+" than one message",plural:"are "+n+" than "+t+" messages"})," ","in the"," ",a.default.createElement(f.Pluralize,{value:i,singular:"last minute",plural:"last "+i+" minutes"}),"."," ",a.default.createElement(r.default,{alertCondition:e})," ",a.default.createElement(s.default,{alertCondition:e})," ",a.default.createElement(d.default,{alertCondition:e}))}});exports.default=c,e.exports=exports.default},1039:function(e,exports,t){"use strict";function n(e){return e&&e.__esModule?e:{default:e}}Object.defineProperty(exports,"__esModule",{value:!0});var i=t(1038);Object.defineProperty(exports,"MessageCountConditionSummary",{enumerable:!0,get:function(){return n(i).default}})},1362:function(e,exports,t){"use strict";function n(e){return e&&e.__esModule?e:{default:e}}Object.defineProperty(exports,"__esModule",{value:!0});var i=t(2),a=n(i),o=t(1),r=n(o),l=t(15),s=t(958),u=t(965),d=n(u),f=t(48),c=t(966),p=t(75),m=n(p),h=t(959),y=n(h),C=t(18),g=n(C),_=g.default.getStore("CurrentUser"),E=a.default.createClass({displayName:"NewAlertConditionPage",mixins:[r.default.connect(_)],render:function(){return a.default.createElement(f.DocumentTitle,{title:"New alert condition"},a.default.createElement("div",null,a.default.createElement(f.PageHeader,{title:"New alert condition"},a.default.createElement("span",null,"Define an alert condition and configure the way Graylog will notify you when that condition is satisfied."),a.default.createElement("span",null,"Are the default conditions not flexible enough? You can write your own! Read more about alerting in the"," ",a.default.createElement(d.default,{page:y.default.PAGES.ALERTS,text:"documentation"}),"."),a.default.createElement("span",null,a.default.createElement(s.LinkContainer,{to:m.default.ALERTS.CONDITIONS},a.default.createElement(l.Button,{bsStyle:"info"},"Manage conditions"))," ",a.default.createElement(s.LinkContainer,{to:m.default.ALERTS.NOTIFICATIONS},a.default.createElement(l.Button,{bsStyle:"info"},"Manage notifications")))),a.default.createElement(l.Row,{className:"content"},a.default.createElement(l.Col,{md:12},a.default.createElement(c.CreateAlertConditionInput,null)))))}});exports.default=E,e.exports=exports.default},964:function(e,exports,t){"use strict";function n(e){return e&&e.__esModule?e:{default:e}}Object.defineProperty(exports,"__esModule",{value:!0});var i=t(977);Object.defineProperty(exports,"AlertNotification",{enumerable:!0,get:function(){return n(i).default}});var a=t(978);Object.defineProperty(exports,"AlertNotificationsComponent",{enumerable:!0,get:function(){return n(a).default}});var o=t(979);Object.defineProperty(exports,"AlertNotificationsList",{enumerable:!0,get:function(){return n(o).default}});var r=t(980);Object.defineProperty(exports,"CreateAlertNotificationInput",{enumerable:!0,get:function(){return n(r).default}});var l=t(981);Object.defineProperty(exports,"UnknownAlertNotification",{enumerable:!0,get:function(){return n(l).default}})},966:function(e,exports,t){"use strict";function n(e){return e&&e.__esModule?e:{default:e}}Object.defineProperty(exports,"__esModule",{value:!0}),exports.UnknownAlertCondition=exports.GenericAlertConditionSummary=exports.EditAlertConditionForm=exports.CreateAlertConditionInput=exports.ConditionAlertNotifications=exports.AlertConditionsList=exports.AlertConditionsComponent=exports.AlertConditionSummary=exports.AlertConditionForm=exports.AlertCondition=void 0;var i=t(1024);Object.defineProperty(exports,"AlertCondition",{enumerable:!0,get:function(){return n(i).default}});var a=t(1025);Object.defineProperty(exports,"AlertConditionForm",{enumerable:!0,get:function(){return n(a).default}});var o=t(1026);Object.defineProperty(exports,"AlertConditionSummary",{enumerable:!0,get:function(){return n(o).default}});var r=t(1027);Object.defineProperty(exports,"AlertConditionsComponent",{enumerable:!0,get:function(){return n(r).default}});var l=t(1028);Object.defineProperty(exports,"AlertConditionsList",{enumerable:!0,get:function(){return n(l).default}});var s=t(1029);Object.defineProperty(exports,"ConditionAlertNotifications",{enumerable:!0,get:function(){return n(s).default}});var u=t(1030);Object.defineProperty(exports,"CreateAlertConditionInput",{enumerable:!0,get:function(){return n(u).default}});var d=t(1031);Object.defineProperty(exports,"EditAlertConditionForm",{enumerable:!0,get:function(){return n(d).default}});var f=t(1032);Object.defineProperty(exports,"GenericAlertConditionSummary",{enumerable:!0,get:function(){return n(f).default}});var c=t(1033);Object.defineProperty(exports,"UnknownAlertCondition",{enumerable:!0,get:function(){return n(c).default}});var p=t(262),m=t(1035),h=t(1037),y=t(1039);p.PluginStore.register(new p.PluginManifest({},{alertConditions:[{summaryComponent:m.FieldContentConditionSummary,type:"field_content_value"},{summaryComponent:h.FieldValueConditionSummary,type:"field_value"},{summaryComponent:y.MessageCountConditionSummary,type:"message_count"}]}))},969:function(e,exports,t){"use strict";Object.defineProperty(exports,"__esModule",{value:!0});var n=t(2),i=function(e){return e&&e.__esModule?e:{default:e}}(n),a=i.default.createClass({displayName:"BacklogSummary",propTypes:{alertCondition:i.default.PropTypes.object.isRequired},_formatMessageCount:function(e){return 0===e?"Not including any messages":1===e?"Including last message":"Including last "+e+" messages"},render:function(){var e=this.props.alertCondition.parameters.backlog;return i.default.createElement("span",null,this._formatMessageCount(e)," in alert notification.")}});exports.default=a,e.exports=exports.default},970:function(e,exports,t){"use strict";Object.defineProperty(exports,"__esModule",{value:!0});var n=t(2),i=function(e){return e&&e.__esModule?e:{default:e}}(n),a=i.default.createClass({displayName:"GracePeriodSummary",propTypes:{alertCondition:i.default.PropTypes.object.isRequired},_formatTime:function(e){return 1===e?"1 minute":e+" minutes"},render:function(){var e=this.props.alertCondition.parameters.grace;return i.default.createElement("span",null,"Grace period: ",this._formatTime(e),".")}});exports.default=a,e.exports=exports.default},972:function(e,exports,t){"use strict";Object.defineProperty(exports,"__esModule",{value:!0});var n=t(2),i=function(e){return e&&e.__esModule?e:{default:e}}(n),a=i.default.createClass({displayName:"RepeatNotificationsSummary",propTypes:{alertCondition:i.default.PropTypes.object.isRequired},render:function(){var e=this.props.alertCondition.parameters.repeat_notifications||!1;return i.default.createElement("span",null,"Configured to ",!e&&i.default.createElement("b",null,"not")," repeat notifications.")}});exports.default=a,e.exports=exports.default},977:function(e,exports,t){"use strict";function n(e){return e&&e.__esModule?e:{default:e}}Object.defineProperty(exports,"__esModule",{value:!0});var i=t(2),a=n(i),o=t(1),r=n(o),l=t(15),s=t(168),u=n(s),d=t(86),f=n(d),c=t(48),p=t(964),m=t(962),h=f.default.get("AlertNotifications"),y=h.AlertNotificationsStore,C=f.default.get("AlarmCallbacks"),g=C.AlarmCallbacksActions,_=f.default.get("CurrentUser"),E=_.CurrentUserStore,v=a.default.createClass({displayName:"AlertNotification",propTypes:{alertNotification:a.default.PropTypes.object.isRequired,stream:a.default.PropTypes.object,onNotificationUpdate:a.default.PropTypes.func,onNotificationDelete:a.default.PropTypes.func},mixins:[r.default.connect(y),r.default.connect(E),u.default],getInitialState:function(){return{isTestingAlert:!1}},_onTestNotification:function(){var e=this;this.setState({isTestingAlert:!0}),y.testAlert(this.props.alertNotification.id).finally(function(){return e.setState({isTestingAlert:!1})})},_onEdit:function(){this.refs.configurationForm.open()},_onSubmit:function(e){var t=this;g.update(this.props.alertNotification.stream_id,this.props.alertNotification.id,e).then(function(){"function"==typeof t.props.onNotificationUpdate&&t.props.onNotificationUpdate()})},_onDelete:function(){var e=this;window.confirm("Really delete alert notification?")&&g.delete(this.props.alertNotification.stream_id,this.props.alertNotification.id).then(function(){"function"==typeof e.props.onNotificationUpdate&&e.props.onNotificationUpdate()})},render:function(){if(!this.state.availableNotifications)return a.default.createElement(c.Spinner,null);var e=this.props.alertNotification,t=this.props.stream,n=this.state.availableNotifications[e.type];if(!n)return a.default.createElement(p.UnknownAlertNotification,{alertNotification:e,onDelete:this._onDelete});var i=t?a.default.createElement("span",null,"Executed once per triggered alert condition in stream ",a.default.createElement("em",null,t.title)):"Not executed, as it is not connected to a stream",o=this.isPermitted(this.state.currentUser.permissions,["streams:edit:"+t.id])&&[a.default.createElement(l.Button,{key:"test-button",bsStyle:"info",disabled:this.state.isTestingAlert,onClick:this._onTestNotification},this.state.isTestingAlert?"Testing...":"Test"),a.default.createElement(l.DropdownButton,{key:"more-actions-button",title:"More actions",pullRight:!0,id:"more-actions-dropdown-"+e.id},a.default.createElement(l.MenuItem,{onSelect:this._onEdit},"Edit"),a.default.createElement(l.MenuItem,{divider:!0}),a.default.createElement(l.MenuItem,{onSelect:this._onDelete},"Delete"))],r=a.default.createElement(l.Col,{md:12},a.default.createElement("div",{className:"alert-callback alarm-callbacks"},a.default.createElement(m.ConfigurationForm,{ref:"configurationForm",key:"configuration-form-notification-"+e.id,configFields:n.requested_configuration,title:"Editing alert configuration ",typeName:e.type,titleValue:e.title,submitAction:this._onSubmit,values:e.configuration}),a.default.createElement(m.ConfigurationWell,{configuration:e.configuration,typeDefinition:n})));return a.default.createElement(c.EntityListItem,{key:"entry-list-"+e.id,title:e.title?e.title:"Untitled",titleSuffix:"("+n.name+")",description:i,actions:o,contentRow:r})}});exports.default=v,e.exports=exports.default},978:function(e,exports,t){"use strict";function n(e){return e&&e.__esModule?e:{default:e}}Object.defineProperty(exports,"__esModule",{value:!0});var i=t(2),a=n(i),o=t(1),r=n(o),l=t(15),s=t(958),u=t(960),d=n(u),f=t(48),c=t(964),p=t(75),m=n(p),h=t(86),y=n(h),C=y.default.get("AlertNotifications"),g=C.AlertNotificationsStore,_=C.AlertNotificationsActions,E=y.default.get("Streams"),v=E.StreamsStore,b=a.default.createClass({displayName:"AlertNotificationsComponent",mixins:[r.default.connect(g)],getInitialState:function(){return{streams:void 0}},componentDidMount:function(){this._loadData()},_loadData:function(){var e=this;v.listStreams().then(function(t){e.setState({streams:t})}),_.available(),_.listAll()},_isLoading:function(){return!this.state.streams||!this.state.availableNotifications||!this.state.allNotifications},render:function(){if(this._isLoading())return a.default.createElement(f.Spinner,null);var e=this.state.allNotifications.sort(function(e,t){var n=e.title||"Untitled",i=t.title||"Untitled";return(0,d.default)(n.toLowerCase(),i.toLowerCase())});return a.default.createElement("div",null,a.default.createElement("div",{className:"pull-right"},a.default.createElement(s.LinkContainer,{to:m.default.ALERTS.NEW_NOTIFICATION},a.default.createElement(l.Button,{bsStyle:"success"},"Add new notification"))),a.default.createElement("h2",null,"Notifications"),a.default.createElement("p",null,"These are all configured alert notifications."),a.default.createElement(c.AlertNotificationsList,{alertNotifications:e,streams:this.state.streams,onNotificationUpdate:this._loadData,onNotificationDelete:this._loadData}))}});exports.default=b,e.exports=exports.default},979:function(e,exports,t){"use strict";Object.defineProperty(exports,"__esModule",{value:!0});var n=t(2),i=function(e){return e&&e.__esModule?e:{default:e}}(n),a=t(964),o=t(48),r=i.default.createClass({displayName:"AlertNotificationsList",propTypes:{alertNotifications:i.default.PropTypes.array.isRequired,streams:i.default.PropTypes.array.isRequired,onNotificationUpdate:i.default.PropTypes.func,onNotificationDelete:i.default.PropTypes.func},getInitialState:function(){return{currentPage:0}},PAGE_SIZE:10,_onChangePaginatedList:function(e){this.setState({currentPage:e-1})},_paginatedNotifications:function(){return this.props.alertNotifications.slice(this.state.currentPage*this.PAGE_SIZE,(this.state.currentPage+1)*this.PAGE_SIZE)},_formatNotification:function(e){var t=this.props.streams.find(function(t){return t.id===e.stream_id});return i.default.createElement(a.AlertNotification,{key:e.id,alertNotification:e,stream:t,onNotificationUpdate:this.props.onNotificationUpdate,onNotificationDelete:this.props.onNotificationDelete})},render:function(){var e=this,t=this.props.alertNotifications;return i.default.createElement(o.PaginatedList,{totalItems:t.length,onChange:this._onChangePaginatedList,showPageSizeSelect:!1,pageSize:this.PAGE_SIZE},i.default.createElement(o.EntityList,{bsNoItemsStyle:"info",noItemsText:"There are no configured notifications.",items:this._paginatedNotifications().map(function(t){return e._formatNotification(t)})}))}});exports.default=r,e.exports=exports.default},980:function(e,exports,t){"use strict";function n(e){return e&&e.__esModule?e:{default:e}}Object.defineProperty(exports,"__esModule",{value:!0});var i=t(2),a=n(i),o=t(1),r=n(o),l=t(960),s=n(l),u=t(15),d=t(49),f=t(48),c=t(962),p=t(75),m=n(p),h=t(5),y=n(h),C=t(169),g=n(C),_=t(86),E=n(_),v=E.default.get("AlertNotifications"),b=v.AlertNotificationsStore,S=v.AlertNotificationsActions,A=E.default.get("AlarmCallbacks"),N=A.AlarmCallbacksActions,P=E.default.get("Streams"),T=P.StreamsStore,L=a.default.createClass({displayName:"CreateAlertNotificationInput",mixins:[r.default.connect(b)],getInitialState:function(){return{streams:void 0,selectedStream:void 0,type:this.PLACEHOLDER}},componentDidMount:function(){var e=this;T.listStreams().then(function(t){e.setState({streams:t})}),S.available()},PLACEHOLDER:"placeholder",_onChange:function(e){this.setState({type:e.target.value})},_onStreamChange:function(e){this.setState({selectedStream:this.state.streams.find(function(t){return t.id===e})})},_onSubmit:function(e){var t=this;this.state.selectedStream||y.default.error("Please select the stream that the condition should check.","Could not save condition"),N.save(this.state.selectedStream.id,e).then(function(){g.default.pushState(null,m.default.ALERTS.NOTIFICATIONS)},function(){return t.refs.configurationForm.open()})},_openForm:function(){this.refs.configurationForm.open()},_resetForm:function(){this.setState({type:this.PLACEHOLDER})},_formatNotificationForm:function(e){var t=this.state.availableNotifications[e];return a.default.createElement(c.ConfigurationForm,{ref:"configurationForm",key:"configuration-form-output",configFields:t.requested_configuration,title:"Create new "+t.name,typeName:e,submitAction:this._onSubmit,cancelAction:this._resetForm})},_formatOption:function(e,t){return{value:t,label:e}},_isLoading:function(){return!this.state.availableNotifications||!this.state.streams},render:function(){var e=this;if(this._isLoading())return a.default.createElement(f.Spinner,null);var t=this.state.type!==this.PLACEHOLDER?this._formatNotificationForm(this.state.type):null,n=Object.keys(this.state.availableNotifications).map(function(t){return a.default.createElement("option",{key:"type-option-"+t,value:t},e.state.availableNotifications[t].name)}),i=this.state.streams.map(function(t){return e._formatOption(t.title,t.id)}).sort(function(e,t){return(0,s.default)(e.label.toLowerCase(),t.label.toLowerCase())});return a.default.createElement("div",null,a.default.createElement("h2",null,"Notification"),a.default.createElement("p",{className:"description"},"Define the notification that will be triggered from the alert conditions in a stream."),a.default.createElement(u.Row,null,a.default.createElement(u.Col,{md:6},a.default.createElement("form",null,a.default.createElement(d.Input,{label:"Notify on stream",help:"Select the stream that should use this notification when its alert conditions are triggered."},a.default.createElement(f.Select,{placeholder:"Select a stream",options:i,onValueChange:this._onStreamChange})),a.default.createElement(d.Input,{type:"select",value:this.state.type,onChange:this._onChange,disabled:!this.state.selectedStream,label:"Notification type",help:"Select the notification type that will be used."},a.default.createElement("option",{value:this.PLACEHOLDER,disabled:!0},"Select a notification type"),n),t," ",a.default.createElement(u.Button,{onClick:this._openForm,disabled:this.state.type===this.PLACEHOLDER,bsStyle:"success"},"Add alert notification")))))}});exports.default=L,e.exports=exports.default},981:function(e,exports,t){"use strict";Object.defineProperty(exports,"__esModule",{value:!0});var n=t(2),i=function(e){return e&&e.__esModule?e:{default:e}}(n),a=t(15),o=t(48),r=i.default.createClass({displayName:"UnknownAlertNotification",propTypes:{alertNotification:i.default.PropTypes.object.isRequired,onDelete:i.default.PropTypes.func.isRequired},render:function(){var e=this.props.alertNotification,t=[i.default.createElement(a.DropdownButton,{key:"actions-button",title:"Actions",pullRight:!0,id:"more-actions-dropdown-"+e.id},i.default.createElement(a.MenuItem,{onSelect:this.props.onDelete},"Delete"))],n=i.default.createElement(a.Col,{md:12},i.default.createElement(a.Alert,{bsStyle:"warning"},"Could not resolve notification type. This is most likely caused by a missing plugin in your Graylog setup."));return i.default.createElement(o.EntityListItem,{key:"entry-list-"+e.id,title:"Unknown notification",titleSuffix:"("+e.type+")",description:"Cannot be executed while the notification type is unknown",actions:t,contentRow:n})}});exports.default=r,e.exports=exports.default}});
//# sourceMappingURL=10.f4e666cd5ae6a3e3cac4.js.map