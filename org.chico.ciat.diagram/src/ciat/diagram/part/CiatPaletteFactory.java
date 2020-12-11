
/*
 * 
 */
package ciat.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import ciat.diagram.providers.CiatElementTypes;

/**
 * @generated
 */
public class CiatPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createSociogram1Group());
		paletteRoot.add(createProcessDiagram2Group());
		paletteRoot.add(createDomainDiagram3Group());
		paletteRoot.add(createCTTDiagram4Group());
		paletteRoot.add(createDependencies5Group());
	}

	/**
	* Creates "Sociogram" palette tool group
	* @generated
	*/
	private PaletteContainer createSociogram1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Sociogram1Group_title);
		paletteContainer.setId("createSociogram1Group"); //$NON-NLS-1$
		paletteContainer.add(createSociogram1CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createActor3CreationTool());
		paletteContainer.add(createRol4CreationTool());
		paletteContainer.add(createSoftwareAgent5CreationTool());
		paletteContainer.add(createGroup6CreationTool());
		paletteContainer.add(createTeam7CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createActing9CreationTool());
		paletteContainer.add(createInheritance10CreationTool());
		paletteContainer.add(createAssociation11CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Process Diagram" palette tool group
	* @generated
	*/
	private PaletteContainer createProcessDiagram2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.ProcessDiagram2Group_title);
		paletteContainer.setId("createProcessDiagram2Group"); //$NON-NLS-1$
		paletteContainer.add(createProcessDiagram1CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createInitial3CreationTool());
		paletteContainer.add(createFinal4CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createIndividual6CreationTool());
		paletteContainer.add(createCooperative7CreationTool());
		paletteContainer.add(createCollaborative8CreationTool());
		paletteContainer.add(createAbstract9CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createObject11CreationTool());
		paletteContainer.add(createTool12CreationTool());
		paletteContainer.add(createTemporalCondition13CreationTool());
		paletteContainer.add(createNotification14CreationTool());
		paletteContainer.add(createCondition15CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Domain Diagram" palette tool group
	* @generated
	*/
	private PaletteContainer createDomainDiagram3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.DomainDiagram3Group_title);
		paletteContainer.setId("createDomainDiagram3Group"); //$NON-NLS-1$
		paletteContainer.add(createDomainDiagram1CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createClass3CreationTool());
		paletteContainer.add(createAttribute4CreationTool());
		paletteContainer.add(createOperation5CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createIndividualArea7CreationTool());
		paletteContainer.add(createExclusiveArea8CreationTool());
		paletteContainer.add(createCollaborativeArea9CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createAsociation11CreationTool());
		paletteContainer.add(createGeneralization12CreationTool());
		paletteContainer.add(createAggregation13CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "CTT Diagram" palette tool group
	* @generated
	*/
	private PaletteContainer createCTTDiagram4Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.CTTDiagram4Group_title);
		paletteContainer.setId("createCTTDiagram4Group"); //$NON-NLS-1$
		paletteContainer.add(createCTTDiagram1CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createAbstractTask3CreationTool());
		paletteContainer.add(createApplicationTask4CreationTool());
		paletteContainer.add(createCollaborativeTask5CreationTool());
		paletteContainer.add(createInteractiveTask6CreationTool());
		paletteContainer.add(createUserTask7CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createExclusiveEdition9CreationTool());
		paletteContainer.add(createCollaborativeVisualization10CreationTool());
		paletteContainer.add(createIndividualVisualization11CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Dependencies" palette tool group
	* @generated
	*/
	private PaletteContainer createDependencies5Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Dependencies5Group_title);
		paletteContainer.setId("createDependencies5Group"); //$NON-NLS-1$
		paletteContainer.add(createAggregation1CreationTool());
		paletteContainer.add(createConcurrencyWithInformationPassing2CreationTool());
		paletteContainer.add(createDeterministicChoice3CreationTool());
		paletteContainer.add(createDisabling4CreationTool());
		paletteContainer.add(createDisablingWithInformationPassing5CreationTool());
		paletteContainer.add(createEnabling6CreationTool());
		paletteContainer.add(createEnablingWithInformationPassing7CreationTool());
		paletteContainer.add(createIndependentConcurrency8CreationTool());
		paletteContainer.add(createOrderIndependence9CreationTool());
		paletteContainer.add(createSuspendResume10CreationTool());
		paletteContainer.add(createUndeterministicChoice11CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createSociogram1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Sociogram1CreationTool_title,
				Messages.Sociogram1CreationTool_desc, Collections.singletonList(CiatElementTypes.Sociogram_2001));
		entry.setId("createSociogram1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CiatDiagramEditorPlugin.findImageDescriptor("/org.chico.ciat.figures/images/Sociogram.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createActor3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(CiatElementTypes.Actor_3002);
		types.add(CiatElementTypes.Actor_3008);
		types.add(CiatElementTypes.Actor_3016);
		types.add(CiatElementTypes.Actor_3023);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Actor3CreationTool_title,
				Messages.Actor3CreationTool_desc, types);
		entry.setId("createActor3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CiatDiagramEditorPlugin.findImageDescriptor("/org.chico.ciat.figures/images/Actor.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRol4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(CiatElementTypes.Rol_3001);
		types.add(CiatElementTypes.Rol_3007);
		types.add(CiatElementTypes.Rol_3015);
		types.add(CiatElementTypes.Rol_3022);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Rol4CreationTool_title,
				Messages.Rol4CreationTool_desc, types);
		entry.setId("createRol4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CiatDiagramEditorPlugin.findImageDescriptor("/org.chico.ciat.figures/images/Rol.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSoftwareAgent5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(CiatElementTypes.SoftwareAgent_3003);
		types.add(CiatElementTypes.SoftwareAgent_3009);
		types.add(CiatElementTypes.SoftwareAgent_3017);
		types.add(CiatElementTypes.SoftwareAgent_3024);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SoftwareAgent5CreationTool_title,
				Messages.SoftwareAgent5CreationTool_desc, types);
		entry.setId("createSoftwareAgent5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CiatDiagramEditorPlugin.findImageDescriptor("/org.chico.ciat.figures/images/SoftwareAgent.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGroup6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(CiatElementTypes.Group_3005);
		types.add(CiatElementTypes.Group_3011);
		types.add(CiatElementTypes.Group_3019);
		types.add(CiatElementTypes.Group_3026);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Group6CreationTool_title,
				Messages.Group6CreationTool_desc, types);
		entry.setId("createGroup6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CiatDiagramEditorPlugin.findImageDescriptor("/org.chico.ciat.figures/images/Group.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTeam7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(CiatElementTypes.Team_3004);
		types.add(CiatElementTypes.Team_3010);
		types.add(CiatElementTypes.Team_3018);
		types.add(CiatElementTypes.Team_3025);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Team7CreationTool_title,
				Messages.Team7CreationTool_desc, types);
		entry.setId("createTeam7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CiatDiagramEditorPlugin.findImageDescriptor("/org.chico.ciat.figures/images/Team.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createActing9CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Acting9CreationTool_title,
				Messages.Acting9CreationTool_desc, Collections.singletonList(CiatElementTypes.Acting_4002));
		entry.setId("createActing9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CiatDiagramEditorPlugin.findImageDescriptor("/org.chico.ciat.figures/images/Acting.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInheritance10CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Inheritance10CreationTool_title,
				Messages.Inheritance10CreationTool_desc, Collections.singletonList(CiatElementTypes.Inheritance_4001));
		entry.setId("createInheritance10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CiatDiagramEditorPlugin.findImageDescriptor("/org.chico.ciat.figures/images/Inheritance.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAssociation11CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Association11CreationTool_title,
				Messages.Association11CreationTool_desc, Collections.singletonList(CiatElementTypes.Association_4003));
		entry.setId("createAssociation11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CiatDiagramEditorPlugin.findImageDescriptor("/org.chico.ciat.figures/images/Association.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createProcessDiagram1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ProcessDiagram1CreationTool_title,
				Messages.ProcessDiagram1CreationTool_desc,
				Collections.singletonList(CiatElementTypes.ProcessDiagram_2002));
		entry.setId("createProcessDiagram1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CiatDiagramEditorPlugin.findImageDescriptor("/org.chico.ciat.figures/images/ProcessDiagram.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInitial3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(CiatElementTypes.Init_3033);
		types.add(CiatElementTypes.Init_3038);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Initial3CreationTool_title,
				Messages.Initial3CreationTool_desc, types);
		entry.setId("createInitial3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CiatDiagramEditorPlugin.findImageDescriptor("/org.chico.ciat.figures/images/Initial.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFinal4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(CiatElementTypes.End_3034);
		types.add(CiatElementTypes.End_3039);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Final4CreationTool_title,
				Messages.Final4CreationTool_desc, types);
		entry.setId("createFinal4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CiatDiagramEditorPlugin.findImageDescriptor("/org.chico.ciat.figures/images/Final.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIndividual6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(CiatElementTypes.IndividualTask_3006);
		types.add(CiatElementTypes.IndividualTask_3029);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Individual6CreationTool_title,
				Messages.Individual6CreationTool_desc, types);
		entry.setId("createIndividual6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CiatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.ciat.figures/images/IndividualInteractionTask.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCooperative7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(CiatElementTypes.CooperativeTask_3014);
		types.add(CiatElementTypes.CooperativeTask_3030);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Cooperative7CreationTool_title,
				Messages.Cooperative7CreationTool_desc, types);
		entry.setId("createCooperative7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CiatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.ciat.figures/images/CooperativeInteractionTask.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCollaborative8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(CiatElementTypes.CollaborativeTask_3021);
		types.add(CiatElementTypes.CollaborativeTask_3031);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Collaborative8CreationTool_title,
				Messages.Collaborative8CreationTool_desc, types);
		entry.setId("createCollaborative8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CiatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.ciat.figures/images/CollaborativeInteractionTask.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAbstract9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(CiatElementTypes.AbstractTask_3028);
		types.add(CiatElementTypes.AbstractTask_3032);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Abstract9CreationTool_title,
				Messages.Abstract9CreationTool_desc, types);
		entry.setId("createAbstract9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CiatDiagramEditorPlugin.findImageDescriptor("/org.chico.ciat.figures/images/Abstract.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createObject11CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(CiatElementTypes.Object_3013);
		types.add(CiatElementTypes.Object_3020);
		types.add(CiatElementTypes.Object_3027);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Object11CreationTool_title,
				Messages.Object11CreationTool_desc, types);
		entry.setId("createObject11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CiatDiagramEditorPlugin.findImageDescriptor("/org.chico.ciat.figures/images/Object.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTool12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Tool12CreationTool_title,
				Messages.Tool12CreationTool_desc, Collections.singletonList(CiatElementTypes.Tool_3012));
		entry.setId("createTool12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CiatDiagramEditorPlugin.findImageDescriptor("/org.chico.ciat.figures/images/Tool.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTemporalCondition13CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(CiatElementTypes.TemporalCondition_3035);
		types.add(CiatElementTypes.TemporalCondition_3040);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.TemporalCondition13CreationTool_title,
				Messages.TemporalCondition13CreationTool_desc, types);
		entry.setId("createTemporalCondition13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CiatDiagramEditorPlugin.findImageDescriptor("/org.chico.ciat.figures/images/TemporalCondition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createNotification14CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(CiatElementTypes.Notification_3036);
		types.add(CiatElementTypes.Notification_3041);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Notification14CreationTool_title,
				Messages.Notification14CreationTool_desc, types);
		entry.setId("createNotification14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CiatDiagramEditorPlugin.findImageDescriptor("/org.chico.ciat.figures/images/Notification.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCondition15CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(CiatElementTypes.Condition_3037);
		types.add(CiatElementTypes.Condition_3042);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Condition15CreationTool_title,
				Messages.Condition15CreationTool_desc, types);
		entry.setId("createCondition15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CiatDiagramEditorPlugin.findImageDescriptor("/org.chico.ciat.figures/images/Condition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDomainDiagram1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DomainDiagram1CreationTool_title,
				Messages.DomainDiagram1CreationTool_desc,
				Collections.singletonList(CiatElementTypes.DomainDiagram_2003));
		entry.setId("createDomainDiagram1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CiatDiagramEditorPlugin.findImageDescriptor("/org.chico.ciat.figures/images/DomainDiagram.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createClass3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Class3CreationTool_title,
				Messages.Class3CreationTool_desc, Collections.singletonList(CiatElementTypes.SharedObject_3043));
		entry.setId("createClass3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CiatDiagramEditorPlugin.findImageDescriptor("/org.chico.ciat.figures/images/Object.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAttribute4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Attribute4CreationTool_title,
				Messages.Attribute4CreationTool_desc, Collections.singletonList(CiatElementTypes.Attribute_3047));
		entry.setId("createAttribute4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CiatDiagramEditorPlugin.findImageDescriptor("/org.chico.ciat.figures/images/Attribute.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOperation5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Operation5CreationTool_title,
				Messages.Operation5CreationTool_desc, Collections.singletonList(CiatElementTypes.Operation_3048));
		entry.setId("createOperation5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CiatDiagramEditorPlugin.findImageDescriptor("/org.chico.ciat.figures/images/Operations.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIndividualArea7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.IndividualArea7CreationTool_title,
				Messages.IndividualArea7CreationTool_desc,
				Collections.singletonList(CiatElementTypes.IndividualArea_3046));
		entry.setId("createIndividualArea7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CiatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.ciat.figures/images/IndividualVisualization.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createExclusiveArea8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ExclusiveArea8CreationTool_title,
				Messages.ExclusiveArea8CreationTool_desc,
				Collections.singletonList(CiatElementTypes.ExclusiveEditionArea_3044));
		entry.setId("createExclusiveArea8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CiatDiagramEditorPlugin.findImageDescriptor("/org.chico.ciat.figures/images/ExclusiveEdition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCollaborativeArea9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CollaborativeArea9CreationTool_title,
				Messages.CollaborativeArea9CreationTool_desc,
				Collections.singletonList(CiatElementTypes.CollaborativeArea_3045));
		entry.setId("createCollaborativeArea9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CiatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.ciat.figures/images/CollaborativeVisualization.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAsociation11CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Asociation11CreationTool_title,
				Messages.Asociation11CreationTool_desc,
				Collections.singletonList(CiatElementTypes.ShAssociationLink_4004));
		entry.setId("createAsociation11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CiatDiagramEditorPlugin.findImageDescriptor("/org.chico.ciat.figures/images/Association.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGeneralization12CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Generalization12CreationTool_title,
				Messages.Generalization12CreationTool_desc,
				Collections.singletonList(CiatElementTypes.ShGeneralizationLink_4005));
		entry.setId("createGeneralization12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CiatDiagramEditorPlugin.findImageDescriptor("/org.chico.ciat.figures/images/Generalization.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAggregation13CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Aggregation13CreationTool_title,
				Messages.Aggregation13CreationTool_desc,
				Collections.singletonList(CiatElementTypes.ShAggregationLink_4006));
		entry.setId("createAggregation13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CiatDiagramEditorPlugin.findImageDescriptor("/org.chico.ciat.figures/images/Aggregation.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCTTDiagram1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CTTDiagram1CreationTool_title,
				Messages.CTTDiagram1CreationTool_desc, Collections.singletonList(CiatElementTypes.CTTDiagram_2004));
		entry.setId("createCTTDiagram1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CiatDiagramEditorPlugin.findImageDescriptor("/org.chico.ciat.figures/images/CTTDiagram.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAbstractTask3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AbstractTask3CreationTool_title,
				Messages.AbstractTask3CreationTool_desc,
				Collections.singletonList(CiatElementTypes.CTTAbstractTask_3053));
		entry.setId("createAbstractTask3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CiatDiagramEditorPlugin.findImageDescriptor("/org.chico.ciat.figures/images/AbstractTask.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createApplicationTask4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ApplicationTask4CreationTool_title,
				Messages.ApplicationTask4CreationTool_desc,
				Collections.singletonList(CiatElementTypes.ApplicationTask_3056));
		entry.setId("createApplicationTask4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CiatDiagramEditorPlugin.findImageDescriptor("/org.chico.ciat.figures/images/ApplicationTask.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCollaborativeTask5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CollaborativeTask5CreationTool_title,
				Messages.CollaborativeTask5CreationTool_desc,
				Collections.singletonList(CiatElementTypes.CTTCollaborativeTask_3055));
		entry.setId("createCollaborativeTask5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CiatDiagramEditorPlugin.findImageDescriptor("/org.chico.ciat.figures/images/CollaborativeTask.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInteractiveTask6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InteractiveTask6CreationTool_title,
				Messages.InteractiveTask6CreationTool_desc,
				Collections.singletonList(CiatElementTypes.InteractiveTask_3054));
		entry.setId("createInteractiveTask6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CiatDiagramEditorPlugin.findImageDescriptor("/org.chico.ciat.figures/images/InteractionTask.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUserTask7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.UserTask7CreationTool_title,
				Messages.UserTask7CreationTool_desc, Collections.singletonList(CiatElementTypes.UserTask_3052));
		entry.setId("createUserTask7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CiatDiagramEditorPlugin.findImageDescriptor("/org.chico.ciat.figures/images/UserTask.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createExclusiveEdition9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ExclusiveEdition9CreationTool_title,
				Messages.ExclusiveEdition9CreationTool_desc,
				Collections.singletonList(CiatElementTypes.ExclusiveEdition_3049));
		entry.setId("createExclusiveEdition9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CiatDiagramEditorPlugin.findImageDescriptor("/org.chico.ciat.figures/images/ExclusiveEdition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCollaborativeVisualization10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CollaborativeVisualization10CreationTool_title,
				Messages.CollaborativeVisualization10CreationTool_desc,
				Collections.singletonList(CiatElementTypes.CollaborativeVisualization_3050));
		entry.setId("createCollaborativeVisualization10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CiatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.ciat.figures/images/CollaborativeVisualization.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIndividualVisualization11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.IndividualVisualization11CreationTool_title,
				Messages.IndividualVisualization11CreationTool_desc,
				Collections.singletonList(CiatElementTypes.IndividualVisualization_3051));
		entry.setId("createIndividualVisualization11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CiatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.ciat.figures/images/IndividualVisualization.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAggregation1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Aggregation1CreationTool_title,
				Messages.Aggregation1CreationTool_desc, Collections.singletonList(CiatElementTypes.Aggregation_4007));
		entry.setId("createAggregation1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CiatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.ciat.figures/images/AggregationTransition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createConcurrencyWithInformationPassing2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.ConcurrencyWithInformationPassing2CreationTool_title,
				Messages.ConcurrencyWithInformationPassing2CreationTool_desc,
				Collections.singletonList(CiatElementTypes.ConcurrencyWithInformationPassing_4015));
		entry.setId("createConcurrencyWithInformationPassing2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CiatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.ciat.figures/images/ConcurrencyWithInformationPassingTransition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDeterministicChoice3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.DeterministicChoice3CreationTool_title,
				Messages.DeterministicChoice3CreationTool_desc,
				Collections.singletonList(CiatElementTypes.DeterministicChoice_4016));
		entry.setId("createDeterministicChoice3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CiatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.ciat.figures/images/DeterministicChoiceTransition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDisabling4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Disabling4CreationTool_title,
				Messages.Disabling4CreationTool_desc, Collections.singletonList(CiatElementTypes.Disabling_4009));
		entry.setId("createDisabling4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CiatDiagramEditorPlugin.findImageDescriptor("/org.chico.ciat.figures/images/DisablingTransition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDisablingWithInformationPassing5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.DisablingWithInformationPassing5CreationTool_title,
				Messages.DisablingWithInformationPassing5CreationTool_desc,
				Collections.singletonList(CiatElementTypes.DisablingWithInformationPassing_4011));
		entry.setId("createDisablingWithInformationPassing5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CiatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.ciat.figures/images/DisablingWithInformationPassingTransition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEnabling6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Enabling6CreationTool_title,
				Messages.Enabling6CreationTool_desc, Collections.singletonList(CiatElementTypes.Enabling_4008));
		entry.setId("createEnabling6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CiatDiagramEditorPlugin.findImageDescriptor("/org.chico.ciat.figures/images/EnablingTransition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEnablingWithInformationPassing7CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.EnablingWithInformationPassing7CreationTool_title,
				Messages.EnablingWithInformationPassing7CreationTool_desc,
				Collections.singletonList(CiatElementTypes.EnablingWithInformationPassing_4010));
		entry.setId("createEnablingWithInformationPassing7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CiatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.ciat.figures/images/EnablingWithInformationPassingTransition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIndependentConcurrency8CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.IndependentConcurrency8CreationTool_title,
				Messages.IndependentConcurrency8CreationTool_desc,
				Collections.singletonList(CiatElementTypes.IndependentConcurrency_4012));
		entry.setId("createIndependentConcurrency8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CiatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.ciat.figures/images/IndependentConcurrencyTransition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOrderIndependence9CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.OrderIndependence9CreationTool_title,
				Messages.OrderIndependence9CreationTool_desc,
				Collections.singletonList(CiatElementTypes.OrderIndependence_4013));
		entry.setId("createOrderIndependence9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CiatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.ciat.figures/images/OrderIndependenceTransition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSuspendResume10CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.SuspendResume10CreationTool_title,
				Messages.SuspendResume10CreationTool_desc,
				Collections.singletonList(CiatElementTypes.SuspendResume_4014));
		entry.setId("createSuspendResume10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CiatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.ciat.figures/images/SuspendResumeTransition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUndeterministicChoice11CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.UndeterministicChoice11CreationTool_title,
				Messages.UndeterministicChoice11CreationTool_desc,
				Collections.singletonList(CiatElementTypes.UndeterministicChoice_4017));
		entry.setId("createUndeterministicChoice11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CiatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.ciat.figures/images/UndeterministicChoiceTransition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
