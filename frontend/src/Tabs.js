import React, {Component} from 'react'
import {Header, Icon, Menu, Segment, Sidebar, Card, Image} from 'semantic-ui-react'

import {Tab, TabList, TabPanel, TabProvider} from 'react-web-tabs';






export default class Tabs extends Component {

    state = {
        def:'two'
    }

    render() {
        const {def} = this.state;
        return (
            <Tabs>
                <TabProvider defaultTab={def}>
                    <section className="my-tabs">
                        <TabList className="my-tablist">
                            <Tab tabFor="one" className="my-tab">Профиль<Icon onClick={this.closeTab}
                                                                              name='close'></Icon></Tab>
                            <Tab tabFor="two">Штат <Icon onClick={this.closeTab} name='close'></Icon></Tab>
                            <Tab tabFor="three">Гупповые тренировки<Icon onClick={this.closeTab}
                                                                         name='close'></Icon></Tab>
                            <Tab tabFor="four" className="my-tab">Справочник<Icon onClick={this.closeTab}
                                                                                  name='close'></Icon></Tab>
                        </TabList>
                        //контент для Табов !!!!!
                        <div className="wrapper">
                            <TabPanel tabId="one">
                                <p>Profile content tab</p>
                            </TabPanel>
                            <TabPanel tabId="two">
                                <p>Tab 1 content</p>
                            </TabPanel>
                            <TabPanel tabId="three">
                                <p>Tab 2 content</p>
                            </TabPanel>
                            <TabPanel tabId="four">
                                <p>Tab 3 content</p>
                            </TabPanel>
                        </div>
                    </section>
                </TabProvider>
            </Tabs>
        );
    }
}