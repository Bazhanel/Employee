import React, {Component} from 'react'
import {Header, Icon, Menu, Segment, Sidebar} from 'semantic-ui-react'
import {Tab, TabList, TabPanel, TabProvider} from 'react-web-tabs';
import displayTab from './functions'
import 'react-web-tabs/dist/react-web-tabs.css';
import './Tabs.scss'
import './Menu.scss'
export default class SidebarExampleSidebar extends Component {


    handleHideClick = () => this.setState({
        className: 'hided' ,
        side: 'open-sidebar',
        clickSide: this.handleShowClick,
        icons:'closed',});

    handleShowClick = () => this.setState({
        className: 'showed' ,
        side: 'open-sidebar reverse',
        clickSide: this.handleHideClick,
        icons:'opened animate'});

    selectTab = (event) => {
        const tab = event.currentTarget.getAttribute('def');
        displayTab(tab + '-tab');
        this.setState({
            def: tab
        })};
    closeTab = (event) =>{
        const tab = event.target;
        console.log(tab)
    }
    state = {def:'two',className: 'hided' ,clickSide: this.handleShowClick ,side: 'open-sidebar',icons:'closed'}

    render() {
        const {def} = this.state;
        const {className} = this.state;
        const {side} = this.state;
        const {clickSide} = this.state;
        const {icons} = this.state;

        return (
            <div className='wrap'>
                <Sidebar.Pushable
                    className='main'
                    as={Segment}>
                    <Sidebar
                        as={Menu}
                        animation='push'
                        icon='labeled'
                        inverted
                        vertical
                        className={className}
                        visible= {true}
                        width='thin'
                    >
                        <Menu.Item
                            as='a'
                            id='open-bar'
                            onClick={clickSide}
                            className={side}
                            >
                            >
                        </Menu.Item>
                        <Menu.Item
                            as='a'
                            id='home'
                            def='one'
                            onClick={this.selectTab}
                        >
                            <Icon
                                name='home'
                                className={icons}
                            />
                            <p
                                className={className}
                            >
                                Штат
                            </p>
                        </Menu.Item>
                        <Menu.Item
                            def='two'
                            id='group'
                            as='a'
                            onClick={this.selectTab}
                        >

                            <Icon
                                name='gamepad'
                                className={icons}
                            />
                            <p
                                className={className}
                            >
                                Групповые тренировки
                            </p>
                        </Menu.Item>
                        <Menu.Item
                            id='notes'
                            def='three'
                            onClick={this.selectTab}
                            as='a'
                        >
                            <Icon
                                name='edit'
                                className={icons}
                            />
                            <p
                                className={className}
                            >Справочник
                            </p>
                        </Menu.Item>
                    </Sidebar>
                    <Sidebar.Pusher>

                        <Segment
                            basic>

                            <Header as='h3'>Application Content</Header>
                            {/*<Image src='/images/wireframe/paragraph.png' />*/}
                            <TabProvider defaultTab={def}>
                                <section className="my-tabs">
                                    <TabList  className="my-tablist">
                                        <Tab tabFor="one">Штат <Icon onClick={this.closeTab} name='close'></Icon></Tab>
                                        <Tab tabFor="two">Гупповые тренировки<Icon onClick={this.closeTab} name='close'></Icon></Tab>
                                        <Tab tabFor="three" className="my-tab">Справочник<Icon onClick={this.closeTab} name='close'></Icon></Tab>
                                    </TabList>



                                    //контент для Табов !!!!!
                                    <div className="wrapper">
                                        <TabPanel tabId="one">
                                            <p>Tab 1 content</p>
                                        </TabPanel>
                                        <TabPanel tabId="two">
                                            <p>Tab 2 content</p>
                                        </TabPanel>
                                        <TabPanel tabId="three">
                                            <p>Tab 3 content</p>
                                        </TabPanel>
                                    </div>
                                    //



                                </section>
                            </TabProvider>
                        </Segment>
                    </Sidebar.Pusher>
                </Sidebar.Pushable>
            </div>
        )

    }

}
